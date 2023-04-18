package shape;

abstract class Shape {
	// private fields of abstract parent class shape
	private float width;
	private float length;
	private String color;
	private String name;
	// constructor method of abstract shape class
	public Shape(float width, float length, String color, String name) {
		this.width = width;
		this.length = length;
		this.color = color;
		this.name = name;
	}
	// accessors and mutators methods
	public float getWidth() {
		return width;
	}
	public float getLength() {
		return length;
	}
	public String getColor() {
		return color;
	}
	public String getName() {
		return name;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override			// overriding the string method
	public String toString() {
		return ("The shape is "+ name + "\nThe color is " + color +
				"\nThe length is " + length + "\nThe width is " + width);
	}
	// creating abstract methods for child classes
	abstract float area();		 // creates an abstract method called area
	abstract float radius();	 // creates an abstract method called radius
}
