public class Main {

   public static void main(String []args) {
      
      // Create a new String -> SHORTCUT
      String lebron = "Goat";
      // But Strings are actually OBJECTS
      // The original way to create a STring
      String steph = new String("GOAT");

      // All objects can be created using this pattern
      // ClassName objectName = new ClassName();
      BuildABear basicBear = new BuildABear();
      // "BuildABear kitty" is DECLARING a variable of type BuildABear
      // "new BuildABear()" is CALLING a CONSTRUCTOR to set up the object

      // Look at our new object
      System.out.println(basicBear);

      // Create a new obkect wit our values
      // called the CONSTRUCTOR: ClassName(String, String, int)
      BuildABear puppy = new BuildABear("dog", "James", 90);

      // Printing an OBJECT calls the CLASS' toString() method
      System.out.println(puppy);

      // Test our methods below by CALLING them on an object instance
      // GETTERS are NON-VOID (we need to handle output data)
      System.out.println( puppy.getType() );
      // or, store the return value in a variable
      double price = puppy.getPrice();
      System.out.println(price);

      // SETTERS are VOID (means no return value)
      // Calling voud methods: objectName.methodName();
      puppy.setName("James");
      puppy.setFillLevel(90);
      // setters (mutators) changes vaues. let's see the effects:
      System.out.println(puppy);

      // STATIC variables & methods belong to a CLASS
      // get CALLED using the Class name, NOT an obkect
      BuildABear.showStore();
      // we've used statioc methods from the Math class!!
      double randNum = Math.random();
      // NOTE: the main method is static bc there is
      // ONLY ONE COPY of it per program!

      

   } // end main() METHOD
} // end Main CLASS
