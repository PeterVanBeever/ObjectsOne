package object1;

import java.util.logging.Logger;

public class Main {

    public static void main(String... args) {
        Logger logger=Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");

        //initialize obj
        Person person1 = new Person("John", 30, 55);
        //log param of obj
        System.out.println(person1.height);
        logger.info(String.valueOf(person1.height));

        //create new chair instance/obj
        Chair peterChair = new Chair("plastic", "pink",3);
        System.out.println("Peters height is " + person1.height);
        Chair qianChair = new Chair("metal","blue",4);
        System.out.println("Qians chair is made of " + qianChair.getMaterial());

        //make dog array
        Dog[] mutts = new Dog[10]; // an array of 10 Person objects

        //add dog to array
        mutts[1] = new Dog("Spot", 5,"beagle");


        System.out.println("The first ugly mutt is " + mutts[1].getName());
        // what is an array? see below...
    }

}
