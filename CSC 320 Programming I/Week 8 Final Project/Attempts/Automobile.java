import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;

class Automobile {

    private String make;
    private String model;
    private String color;
    private int year;
    private int mileage;

        // parameterized constructor
        public Automobile (String make, String model, String color, int year, int mileage){
            this.make = make;
            this.model = model;  // new constructor arguments
            this.color = color;
            this.year = year;
            this.mileage = mileage;
                
        }
    
        /* getters and setters  */
        public String getMake() throws Exception{
            if (make != null && make.length() == 0){

                throw new Exception("Failure");
        
              } else{
        
                System.out.println("Success\n");
        
              }
            return make;
        }
        public void setMake(String make) {
            this.make = make;
            }
        
        public String getModel()throws Exception{
            if(model != null && model.length() == 0){

                throw new Exception("Failure");
        
              } else{
        
                System.out.println("Success\n");
        
              }
            return model;
            }
        
        public void setModel(String model){
            this.model = model;
            }
        
        public String getColor() throws Exception{
            if (color != null && color.length() == 0){
 
                throw new Exception("Failure");
        
              } else{
        
                System.out.println("Success\n");
        
              }
              return color;
            }

        public void setColor(String color){
            this.color = color;
            }

        public int getYear(){
            if (year < 1886 || year > 2023){

                throw new Exception("Failure");
        
              } else{
        
                System.out.println("Success\n");
        
              }
              return year;
            }

        public void setYear(int year){
            this.year = year;
            }

        public int getMile() throws Exception{
            if (mileage < 0){

                throw new Exception("Failure");
        
              } else{
        
                System.out.println("Success\n");
        
              }
              return mileage;
            }

        public void setMile(int mileage){
            this.mileage = mileage;
            }
 
        public static void removeAuto(ArrayList<Automobile> auto, ArrayList<Automobile> vehicle){
            StringBuffer buff = new StringBuffer();
            
            for (String str : vehicle) {
               buff.append(str);
               buff.append(" ");
            }
            String str = buff.toString();
            int i = 0;
            boolean r = false;
            while ( (!r) && (i < auto.size()) ) {
                if (auto.get(i).equals(str)) {
                   vehicle.remove(i); // Remove
                   r = true; 
                    }
                    ++i;
                }
              
            }
            public void printVehicle(ArrayList<Automobile> vehicle) {
                int len = vehicle.size();
                for(int i =0 ; i < len;++i){
                System.out.println("Manufacturer: " + make);
                System.out.println("Color: " + color);
                System.out.println("Year: " + year);
                System.out.println("Miles: " + mileage+"\n");
                }
          }
          public static void printAll(ArrayList<Automobile> auto){
            int len = auto.size();
            for(int i = 0; i < len; ++i){
                System.out.println(auto);
            }
          }
          public static void updateAttributes(ArrayList<Automobile> auto, ArrayList<Automobile> vehicle) {
            //allows user to update attribute of specific vehicle
            StringBuffer buff = new StringBuffer();
            
            for (String str : vehicle) {
               buff.append(str);
               buff.append(" ");
            }
            String str = buff.toString();
           
            int len = auto.size();
            int lenV = vehicle.size();
            if (len == lenV) {
                for (int i = 0; i < len; ++i) {
                     auto.get(i).setMake(vehicle.get(i));
                }
            }
        }



      /*StringBuilder sb = new StringBuilder();
                for (String s : vehicle){
                            sb.append(s);
                            sb.append("\t");
                        }
                        
                        
                          userList.removeIf(user-> user.getName().equals("yourUserName"));
                Iterator<String> iter = vehicle.iterator();
                while (iter.hasNext()) 
                {
                    User user = iter.next();
                    if(user.name.equals("user1"))
                    {
                        //Use iterator to remove this User object.
                        iter.remove();
                    }
                }








                   public void setMake(String make){
        if (make != null && !make.isEmpty()) {
           throw new IllegalArgumentException("Failure\n");
        }else{
            System.out.println("Success\n");
        this.make = make;
        }
    }
    public void setModel(String model){
        if(model != null && !model.isEmpty()){
            throw new IllegalArgumentException("Failure\n");
        } else{
            System.out.println("Success\n");
        this.model = model;
    }
    }
    public void setColor(String color){
        if(color != null && !color.isEmpty()){
            throw new IllegalArgumentException("Failure\n");
        }else{
            System.out.println("Success\n");
        this.color = color;
    }
    }
    public void setYear(int year){
        if (year < 1886 || year > 2023) {
            throw new IllegalArgumentException("Failure\n");
        } else{
            System.out.println("Success\n");
        this.year = year;
    }
    }
    //Here we need to update the mileage property
    public void setMileage(int mileage){
        if(mileage < 0 || mileage > 375000){
            throw new IllegalArgumentException("Failure\n");
        } else{
            System.out.println("Success\n");
        this.mileage = mileage;
    }
}
}

                        */
            