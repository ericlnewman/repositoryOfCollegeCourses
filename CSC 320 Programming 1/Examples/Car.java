public class Car {
   private boolean engine = true;
   private String model;
   private int wheels = 4;
   private int cylinder;
   private int doors = 4;
   private int speed;
   private int maxspeed ;

   public Car(boolean engine, String model, int wheels, int cylinder, int doors, int speed,int maxspeed) {
       this.engine = engine;
       this.model = model;
       this.wheels = wheels;
       this.cylinder = cylinder;
       this.doors = doors;
       this.speed = speed;
       this.maxspeed = maxspeed;
   }
   public void TurnOnOffEngine(boolean turn){
       if(turn){
           this.engine = true;
           System.out.println("Your start your engine");
       }System.out.println("Your engine is off");

   }

   public int Accelerate(int acceleration,int maxspeed){
       if(this.speed > 0 && this.speed<maxspeed)
       {
           this.speed += speed;
       }else
       {
           System.out.println("Illegal speed limit");
           if(acceleration>0)
           {
               System.out.println("you still have " + acceleration + " to reach your maximum speed");
           }
       }
       return this.speed;
   }
   public void stopEngine(){
       engineMode();
   }
   public void startEngine(){
       engineMode();
   }
   private void engineMode() {
       System.out.println("your engine mode is");
       if(this.engine == true){
           System.out.println("ON");
       }else{
           System.out.println("OFF");
       }
   }

   public void setSpeed(int speed,int maxspeed) {
       if(this.speed+speed < maxspeed){
           this.speed += speed;
           System.out.println("Your speed now is "+ this.speed);
       }else{
           System.out.println("Speed out of limits");
       }


   }

   public int getSpeed() {
       return speed;
   }

   public void breakCar(int speed){
       if(this.speed > speed){
           this.speed -= speed;
           System.out.println("Car has slow down,your speed now is "+this.speed);
       }else if(this.speed-speed <= 0){
           System.out.println("your car has stopped ");
       }


   }
   public boolean getEngine() {
       return engine;
   }

   public void setEngine(boolean engine) {
       this.engine = engine;
   }

   public String getModel() {
       return model;
   }

   public void setModel(String model) {
       this.model = model;
   }

   public int getWheels() {
       return wheels;
   }

   public void setWheels(int wheels) {
       this.wheels = wheels;
   }

   public int getCylinder() {
       return cylinder;
   }

   public void setCylinder(int cylinder) {
       this.cylinder = cylinder;
   }

   public int getDoors() {
       return doors;
   }

   public void setDoors(int doors) {
       this.doors = doors;
   }
}