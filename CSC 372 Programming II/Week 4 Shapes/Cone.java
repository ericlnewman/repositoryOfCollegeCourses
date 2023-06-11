class Cone extends Shape{
    private double radius;                                                          // private instance of radius for class
    private double height;                                                            // private instance of height for class
    Cone(double radius, double height){
        this.radius =  radius;                                                      // parameterized constructor to initialize the radius data
        this.height = height;                                                       // parameterized constructor to initialize the height data
    }

    @Override
    public double surface_area(){                 // surface area of a cone is PI * radius(radius + squareroot(height squared + radius squared))
        return ((Math.PI * this.radius) * (Math.sqrt((this.height * this.height) + (this.radius * this.radius)))); 
    }

    @Override
    public double volume(){
        return (Math.PI * this.radius * this.radius * this.height)/3;           // volume of a cone is PI *  radius squared * (height/3)
    }

    public String toString(){
        return "Cone's surface area: " + surface_area() + ", Volume: " + volume();   // make the information be turned into a string
    }
}