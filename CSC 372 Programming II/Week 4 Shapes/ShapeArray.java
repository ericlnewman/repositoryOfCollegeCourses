public class ShapeArray{
    public static void main(String[] args){                                             // creat a main method
        Sphere newSphere = new Sphere(12.12);                                   // instantiate sphere class and give radius
        Cylinder newCylinder = new Cylinder(6.67,18.97);                // instantiate cylinder class and give radius and height
        Cone newCone = new Cone(8.13,5.73);                             // instantiate cone class and give radius and height
        Shape[] arrayShapes = new Shape[]{newSphere, newCylinder, newCone};            // make an array of the above
        for(int i = 0; i < arrayShapes.length; i++){                                   // for loop to print out the array on the terminal 
            System.out.println(arrayShapes[i]);                                        // can also do for(Shape shape: arrayShapes)
        }
    }
}