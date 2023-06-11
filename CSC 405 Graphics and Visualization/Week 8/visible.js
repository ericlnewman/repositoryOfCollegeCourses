var vertexShaderText = 
[
'precision mediump float;',
'',
'attribute vec3 vertPosition;',
'attribute vec3 vertColor;',
'varying vec3 fragColor;',
'uniform mat4 mWorld;',
'uniform mat4 mView;',
'uniform mat4 mProj;',
'',
'void main()',
'{',
'  fragColor = vertColor;',
'  gl_Position = mProj * mView * mWorld * vec4(vertPosition, 1.0);',
'}'
].join('\n');

var fragmentShaderText =
[
'precision mediump float;',
'',
'varying vec3 fragColor;',
'void main()',
'{',
'  gl_FragColor = vec4(fragColor, 1.0);',
'}'
].join('\n');

var gl;
var Initialize3DView = function () {//
	// INITIALIZATION OF SHADERS AND PROGRAM/
	var canvas = document.getElementById('ThreeDView');
	gl = canvas.getContext('webgl'); //, { preserveDrawingBuffer: true });
    if(!gl) gl = canvas.getContext('experimental-webgl', { preserveDrawingBuffer: true });
	if(!gl) alert('Browser does not support WebGL');
	gl.clearColor(0.88, 0.93, 0.92, 1.0);
	gl.clear(gl.COLOR_BUFFER_BIT | gl.DEPTH_BUFFER_BIT);
	gl.enable(gl.DEPTH_TEST);
	gl.frontFace(gl.CCW);
	var vertexShader = gl.createShader(gl.VERTEX_SHADER);
	var fragShader = gl.createShader(gl.FRAGMENT_SHADER);
	gl.shaderSource(vertexShader, vertexShaderText);
	gl.shaderSource(fragShader, fragmentShaderText);
	gl.compileShader(vertexShader);
	if (!gl.getShaderParameter(vertexShader, gl.COMPILE_STATUS)) {
		console.error('ERROR compiling vertex shader', gl.getShaderInfoLog(vertexShader));
		return;
	}
	gl.compileShader(fragShader);
	if (!gl.getShaderParameter(fragShader, gl.COMPILE_STATUS)) {
		console.error('ERROR compiling fragment shader', gl.getShaderInfoLog(fragShader));
		return;
	}
	var program = gl.createProgram();
	gl.attachShader(program, vertexShader);
	gl.attachShader(program, fragShader);
	gl.linkProgram(program);
	if (!gl.getProgramParameter(program, gl.LINK_STATUS)) {
		console.error('ERROR linking program', gl.getProgramInfoLog(program));
		return;
	}
	gl.validateProgram(program);
	if (!gl.getProgramParameter(program, gl.VALIDATE_STATUS)) {
		console.error('ERROR validating program', gl.getProgramInfoLog(program));
		return;
	}
	// END INITIALIZATION

	// INITIALIZE EMPTY VERTICES AND INDICES ARRAYS
	var CVertices = [];
	var CIndices = [];
	var PVertices = [];
	var PIndices = [];
	var ConeVertices = [];
	var ConeIndices = [];
	// END INITIALIZE EMPTY VERTICES AND INDICES ARRAYS

	// CREATE BUFFER OBJECTS
	var PrismVertBufferObject = gl.createBuffer();
	var PrismIndexBufferObject = gl.createBuffer();
	var CylinderVertBufferObject = gl.createBuffer();
	var CylinderIndexBufferObject = gl.createBuffer();
	var ConeVertBufferObject = gl.createBuffer();
	var ConeIndexBufferObject = gl.createBuffer();
	// END CREATE BUFFER OBJECTS

	var positionAttribLocation = gl.getAttribLocation(program, 'vertPosition');
	var colorAttribLocation = gl.getAttribLocation(program, 'vertColor');
	gl.useProgram(program);

	var matWorldUniformLocation = gl.getUniformLocation(program, 'mWorld');
	var matViewUniformLocation = gl.getUniformLocation(program, 'mView');
	var matProjUniformLocation = gl.getUniformLocation(program, 'mProj');
	var worldMatrix = new Float32Array(16);
	var viewMatrix = new Float32Array(16);
	var projMatrix = new Float32Array(16);
	mat4.identity(worldMatrix);
	mat4.lookAt(viewMatrix, [0, 2, -5], [0, 0, 0], [0, 1, 0]);
	mat4.perspective(projMatrix, glMatrix.toRadian(45), canvas.width / canvas.height, 0.1, 1000.0);
	gl.uniformMatrix4fv(matWorldUniformLocation, gl.FALSE, worldMatrix);
	gl.uniformMatrix4fv(matViewUniformLocation, gl.FALSE, viewMatrix);
	gl.uniformMatrix4fv(matProjUniformLocation, gl.FALSE, projMatrix);

	// GENERATE PRISM FUNCTION
	function GeneratePrism() {
		PVertices = [];
		PIndices = [];
  		V1x = Number(document.getElementById('V1x').value);
  		V1y = Number(document.getElementById('V1y').value);
  		V1z = Number(document.getElementById('V1z').value);
  		V2x = Number(document.getElementById('V2x').value);
  		V2y = Number(document.getElementById('V2y').value);
  		V2z = Number(document.getElementById('V2z').value);
  		V3x = Number(document.getElementById('V3x').value);
  		V3y = Number(document.getElementById('V3y').value);
  		V3z = Number(document.getElementById('V3z').value);
  		V4x = Number(document.getElementById('V4x').value);
		V4y = Number(document.getElementById('V4y').value);
		V4z = Number(document.getElementById('V4z').value);
		if(V1x != 0) V1x = -V1x;	
		if(V2x != 0) V2x = -V2x;
		if(V3x != 0) V3x = -V3x;
		if(V4x != 0) V4x = -V4x;
		PVertices.push(V1x, V1y, V1z, .8,.2,1);
		PVertices.push(V2x, V2y, V2z, .1,.7,.4);
		PVertices.push(V3x, V3y, V3z, .4,.4,.9);
		PVertices.push(V4x, V4y, V4z, .6,.1,.3);
		PIndices.push(0,1,2);
		PIndices.push(0,1,3);
		PIndices.push(1,2,3);
		PIndices.push(0,2,3);
		if(document.getElementById('ZBuffer').checked == false)
			gl.disable(gl.DEPTH_TEST);
		else 
			gl.enable(gl.DEPTH_TEST);
		gl.bindBuffer(gl.ARRAY_BUFFER, PrismVertBufferObject);
		gl.bufferData(gl.ARRAY_BUFFER, new Float32Array(PVertices), gl.STATIC_DRAW);
		gl.bindBuffer(gl.ELEMENT_ARRAY_BUFFER, PrismIndexBufferObject);
		gl.bufferData(gl.ELEMENT_ARRAY_BUFFER, new Uint16Array(PIndices), gl.STATIC_DRAW);
		gl.vertexAttribPointer(positionAttribLocation,3,gl.FLOAT,gl.FALSE,6*Float32Array.BYTES_PER_ELEMENT,0);
		gl.vertexAttribPointer(colorAttribLocation,3,gl.FLOAT,gl.FALSE,6*Float32Array.BYTES_PER_ELEMENT,3*Float32Array.BYTES_PER_ELEMENT);
		gl.enableVertexAttribArray(positionAttribLocation);
		gl.enableVertexAttribArray(colorAttribLocation);
		gl.bufferData(gl.ARRAY_BUFFER, new Float32Array(PVertices), gl.STATIC_DRAW);
		gl.bufferData(gl.ELEMENT_ARRAY_BUFFER, new Uint16Array(PIndices), gl.STATIC_DRAW);
		gl.clearColor(0.88, 0.93, 0.92, 1.0);
		gl.clear(gl.DEPTH_BUFFER_BIT | gl.COLOR_BUFFER_BIT);
		gl.drawElements(gl.TRIANGLES, PIndices.length, gl.UNSIGNED_SHORT, 0);
		GenerateCylinder();
	}
	// END GENERATE PRISM FUNCTION
	
	// CLICK HANDLER FOR GENERATE BUTTON
	var GenerateButton = document.getElementById('Generate');
	GenerateButton.addEventListener('click', GeneratePrism);
	// END CLICK HANDLER FOR GENERATE BUTTON

	
	var xRotationMatrix = new Float32Array(16);
	var yRotationMatrix = new Float32Array(16);
	var identityMatrix = new Float32Array(16);
	mat4.identity(identityMatrix);
	var angle = 0;
	var RotateButton = false;
	var StartRotateloop = function () {
		RotateButton = !RotateButton;
		requestAnimationFrame(Rotateloop);
	};
	var Rotateloop = function () {
		if(RotateButton) {
			angle = performance.now() / 1000 / 6 * 2 * Math.PI;
			mat4.rotate(yRotationMatrix, identityMatrix, angle, [0, 1, 0]);
			mat4.rotate(xRotationMatrix, identityMatrix, angle / 4, [1, 0, 0]);
			mat4.mul(worldMatrix, yRotationMatrix, mat4.identity(identityMatrix));
			gl.uniformMatrix4fv(matWorldUniformLocation, gl.FALSE, worldMatrix);
			if(document.getElementById('ZBuffer').checked == false)
				gl.disable(gl.DEPTH_TEST);
			else 
				gl.enable(gl.DEPTH_TEST);
			GeneratePrism();
			requestAnimationFrame(Rotateloop);
		}
	};
	
	function GenerateCylinder() {
		CVertices = [];
		CIndices = [];
		Cx = -Number(document.getElementById('Cx').value);
		Cy = Number(document.getElementById('Cy').value);
		Cz = Number(document.getElementById('Cz').value);
		Radius = Number(document.getElementById('CRadius').value);
		Height = Number(document.getElementById('CHeight').value);
		if(Radius > 2) Radius = 2;
		if(Radius < 0) Radius = 0;
		var slices = 50;
		var y, x, x2, y2;
   		var theta = (Math.PI/180) * (360/slices);
   		var a = CVertices.length;
   		for (i =0; i<=slices; i++) {
			x =  Math.cos(theta*i) * Radius; 
       		y =  Math.sin(theta*i) * Radius;
      		x2 =  Math.cos(theta*(i+1)) * Radius; 
       		y2 =  Math.sin(theta*(i+1)) * Radius;
       		//Top Circle
       		CVertices.push(Cx, Cz, Cy, .90, .80, .30);
      		CVertices.push(Cx + x, Cz, Cy + y, .90, .80, .30);
      		CVertices.push(Cx + x2, Cz, Cy + y2, .90, .80, .30);
 
      		//Bottom Circle
      		CVertices.push(Cx, Cz+Height, Cy , .40, .40, .20);
      		CVertices.push(Cx + x, Cz+Height, Cy + y, .40, .40, .20);
      		CVertices.push(Cx + x2, Cz+Height, Cy + y2, .40, .40, .20);

      		//Cylinder Walls
      		CVertices.push(Cx + x, Cz, Cy + y, .70, .70, .10);
      		CVertices.push(Cx + x2, Cz, Cy + y2, .70, .70, .10);
      		CVertices.push(Cx + x2, Cz+Height, Cy + y2, .70, .70, .10);
      		CVertices.push(Cx + x, Cz+Height, Cy + y, .20, .30, .60);
      		CVertices.push(Cx + x2, Cz+Height, Cy + y2, .20, .30, .60);
      		CVertices.push(Cx + x, Cz, Cy + y, .50, .50, .50);
     	}
     	var b = CVertices.length/6;
     	while(a < b) {
     		CIndices.push(a, a+1, a+2);
     		a+=3;
     	}
     	gl.bindBuffer(gl.ARRAY_BUFFER, CylinderVertBufferObject);
		gl.bufferData(gl.ARRAY_BUFFER, new Float32Array(CVertices), gl.STATIC_DRAW);
		gl.bindBuffer(gl.ELEMENT_ARRAY_BUFFER, CylinderIndexBufferObject);
		gl.bufferData(gl.ELEMENT_ARRAY_BUFFER, new Uint16Array(CIndices), gl.STATIC_DRAW);
		gl.vertexAttribPointer(positionAttribLocation,3,gl.FLOAT,gl.FALSE,6*Float32Array.BYTES_PER_ELEMENT,0);
		gl.vertexAttribPointer(colorAttribLocation,3,gl.FLOAT,gl.FALSE,6*Float32Array.BYTES_PER_ELEMENT,3*Float32Array.BYTES_PER_ELEMENT);
		gl.enableVertexAttribArray(positionAttribLocation);
		gl.enableVertexAttribArray(colorAttribLocation);
		gl.bufferData(gl.ARRAY_BUFFER, new Float32Array(CVertices), gl.STATIC_DRAW);
		gl.bufferData(gl.ELEMENT_ARRAY_BUFFER, new Uint16Array(CIndices), gl.STATIC_DRAW);
		gl.drawElements(gl.TRIANGLES, CIndices.length, gl.UNSIGNED_SHORT, 0);
		GenerateCone();
	}

	function GenerateCone() {
		ConeVertices = [];
		ConeIndices = [];
		Conex = -Number(document.getElementById('Conex').value);
		Coney = Number(document.getElementById('Coney').value);
		Conez = Number(document.getElementById('Conez').value);
		ConeRadius = Number(document.getElementById('ConeRadius').value);
		ConeHeight = Number(document.getElementById('ConeHeight').value);
		if(ConeRadius > 2) ConeRadius = 2;
		if(ConeRadius < 0) ConeRadius = 0;
		var slices = 50;
		var y, x, x2, y2;
   		var theta = (Math.PI/180) * (360/slices);
   		var a = ConeVertices.length;
   		for (i =0; i<=slices; i++) {
			x =  Math.cos(theta*i) * ConeRadius; 
       		y =  Math.sin(theta*i) * ConeRadius;
      		x2 =  Math.cos(theta*(i+1)) * ConeRadius; 
       		y2 =  Math.sin(theta*(i+1)) * ConeRadius;
      		//Bottom Circle
      		ConeVertices.push(Conex, Conez, Coney , .40, .80, .20);
      		ConeVertices.push(Conex + x, Conez, Coney + y, .40, .20, .60);
      		ConeVertices.push(Conex + x2, Conez, Coney + y2, .40, .60, .30);
      		//Cone Walls
      		ConeVertices.push(Conex + x, Conez, Coney + y, .90, .20, .10);
      		ConeVertices.push(Conex + x2, Conez, Coney + y2, .20, .20, .10);
      		ConeVertices.push(Conex, Conez+ConeHeight, Coney , .50, .20, .10);
     	}
     	var b = ConeVertices.length/6;
     	while(a < b) {
     		ConeIndices.push(a, a+1, a+2);
     		a+=3;
     	}
     	gl.bindBuffer(gl.ARRAY_BUFFER, ConeVertBufferObject);
		  gl.bufferData(gl.ARRAY_BUFFER, new Float32Array(ConeVertices), gl.STATIC_DRAW);
		  gl.bindBuffer(gl.ELEMENT_ARRAY_BUFFER, ConeIndexBufferObject);
		  gl.bufferData(gl.ELEMENT_ARRAY_BUFFER, new Uint16Array(ConeIndices), gl.STATIC_DRAW);
		  gl.vertexAttribPointer(positionAttribLocation,3,gl.FLOAT,gl.FALSE,6*Float32Array.BYTES_PER_ELEMENT,0);
		  gl.vertexAttribPointer(colorAttribLocation,3,gl.FLOAT,gl.FALSE,6*Float32Array.BYTES_PER_ELEMENT,3*Float32Array.BYTES_PER_ELEMENT);
		  gl.enableVertexAttribArray(positionAttribLocation);
		  gl.enableVertexAttribArray(colorAttribLocation);
		  gl.bufferData(gl.ARRAY_BUFFER, new Float32Array(ConeVertices), gl.STATIC_DRAW);
		  gl.bufferData(gl.ELEMENT_ARRAY_BUFFER, new Uint16Array(ConeIndices), gl.STATIC_DRAW);
		  gl.drawElements(gl.TRIANGLES, ConeIndices.length, gl.UNSIGNED_SHORT, 0);
	  }
	  var TestVHButton = document.getElementById('Rotate');
	  TestVHButton.addEventListener('click', StartRotateloop);
    GeneratePrism();
};