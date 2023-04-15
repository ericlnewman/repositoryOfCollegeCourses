class Cylinder extends Shape{
    private double radius;                                                          // private instance of radius for class
    private double height;                                                            // private instance of height for class
    Cylinder(double radius, double height){
        this.radius =  radius;                                                      // parameterized constructor to initialize the radius data
        this.height = height;                                                       // parameterized constructor to initialize the height data
    }

    @Override
    public double surface_area(){                          // surface area of a cylinder is (2 * PI * radius * height) + (2 * PI radius squared)
        return ((2 * Math.PI * radius * height) + (2 * Math.PI * radius * radius));  
    }

    @Override
    public double volume(){
        return (Math.PI * this.radius * this.radius * height);           // volume of a cylinder is PI *  radius squared * height
    }

    public String toString(){
        return "Cylinder's surface area: " + surface_area() + ", Volume: " + volume();   // make the information be turned into a string
    }
}