package wsb.creatures;
import java.io.File;


public class Animal{
    final String species; //Fields store data
    public Double weight; // task 1.1 Add field final String species and private Double weight in Animal
    public String name;
    File pic;

    // task 1.2 Add a constructor Animal, which set initial weight of an Animal. Initial weight should depends on species
    private static Double NEW_DOG_WEIGHT=5.4;
    private static Double NEW_LION_WEIGHT=39.2;
    private static Double NEW_CAT_WEIGHT=4.3;
    private static Double NEW_PIG_WEIGHT=10.3;
    // private static Double NEW_OTHER_WEIGHT=100.0;
    //private static Double DEFAULT_FEED_WEIGHT = 1.0;

    public Animal(String species) {
        this.species=species;
        System.out.println (" Hurray, there is a new animal in the family! ");


        switch (species) {
            case "dog": {
                weight=NEW_DOG_WEIGHT;
                break;
            }
            case "lion": {
                weight=NEW_LION_WEIGHT;
                break;
            }
            case "cat": {
                weight=NEW_CAT_WEIGHT;
                break;
            }
            case "pig": {
                weight=NEW_PIG_WEIGHT;
                break;
            }
        }
    }


        // task 1.4. add void takeForAWalk()
        // When you feed an animal it should gain weight, when you take it for a walk it should loose weight.
        // If weight will drop to zero your animal is dead.
        // You should see some pasive-agresive message if you will try to feed or take for a walk dead animal.
        public void takeForAWalk () {
            if (weight == 0.0) {
                System.out.println ("Your Animal is dead - you can't walk it.");
            } else if (weight > 4.0) {
                --weight;
                System.out.println (name + " says thx for a walk");
            } else if (weight > 1.0) {
                --weight;
                System.out.println (name + " is hungry");
            } else {
                weight=0.0;
                System.out.println (name + " starved to death");
            }
        }


        public void kill () {
            System.out.println ("byeeeeeeeeeeeeee");
        }
        public void feed () {
            if (weight == 0) {
                System.out.println (" sooh it's too late to feed" + name + "- it's already dead");
            } else {
                ++weight;
                System.out.println (name + " has been feeded YUMMMMMM");
            }
        }

    }
