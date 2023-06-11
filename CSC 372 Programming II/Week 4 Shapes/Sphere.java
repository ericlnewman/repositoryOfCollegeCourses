class Sphere extends Shape{
    private double radius;                                                          // private instance of radius for class
    Sphere(double radius){
        this.radius =  radius;                                                      // parameterized constructor to initialize the radius data
    }

    @Override
    public double surface_area(){
        return (4 * Math.PI * this.radius * this.radius);                             // surface area of a sphere is 4 *PI * radius squared
    }

    @Override
    public double volume(){
        return ((4/3) * Math.PI * this.radius * this.radius * this.radius);           // volume of a sphere is 4/3 PI * radius cubed
    }

    public String toString(){
        return "Sphere's surface area: " + surface_area() + ", Volume: " + volume();   // make the information be turned into a string
    }
}