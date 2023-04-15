class Animal {

    // field and method of the parent class
    String name;
    public void eat() {
      System.out.println("I can eat");
    }
  }
  
  // inherit from Animal
  class Dog extends Animal {
  
    // new method in subclass
    public void display() {
      System.out.println("My name is " + name);
    }
  }
  
  class Main {
    public static void main(String[] args) {
  
      // create an object of the subclass
      Dog labrador = new Dog();
  
      // access field of superclass
      labrador.name = "Rohu";
      labrador.display();
  
      // call method of superclass
      // using object of subclass
      labrador.eat();
  
    }
  }

  /*
   * 
      class Animal{

    String name;

    public void printname(){
        System.out.print("The name of animal is: " + name);
    }
}

class Dog extends Animal{
    // pass
}

class Main {
    public static void main(String[] args){
        Dog dogObj = new Dog();
        dogObj.name = "Dog";
        dogObj.printname();
    }
}

   */