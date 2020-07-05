package wsb;

import wsb.creatures.Animal;
import wsb.creatures.Human;
import wsb.database.Connector;
import wsb.devices.Car;
import wsb.devices.CompareCars;
import wsb.devices.Phone;


import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        //lesson1

        Animal dog = new Animal("dog");
        dog.name = "Szynek";

        Animal cat = new Animal("cat");
        cat.name = "Kulek";

        Phone szajsung = new Phone("Samsung", "s20", 5000.00, 2019);
        Phone knurofon = new Phone("Samsung", "S10", 3000.00, 2020);

        Human me = new Human(30);
        me.firstName = "Kasia";
        me.lastName = "Pogo";
        me.pet = dog;
        me.mobile = szajsung;
        // System.out.println(dog);
        // me.pet.feed();
        /*me.pet.feed();
        me.pet.feed();
        me.pet.feed();*/
        // me.pet.takeForAWalk();
        // me.setCar(new ElectricCar("X", "Tesla",2020,2.0));

        //task3 Salary
        me.setSalary(10000.00);
        System.out.println("I earn " +me.getSalary() +"PLN");
        me.setCash(100000.00);
        System.out.println("I have " + me.cash + "PLN of extra cash");
        me.increaseSalary(1230.00);
        //System.out.println("I got a raise of " +me.increaseSalary() +"PLN");

        Human knur = new Human(7);
        knur.firstName = "Knuroslaw";
        knur.lastName = "Knurski";
        knur.pet = cat;
        //knur.pet = me.pet;
        knur.mobile = knurofon;
        knur.setCash(100000.00);
        System.out.println("Knur has " + knur.cash + "PLN of extra cash");

        // knur.pet.feed();
        // System.out.println(cat);

        //task3 Salry
        knur.setSalary(5000.00);
        System.out.println("Knur earns " +knur.getSalary());
        knur.increaseSalary(1000.00);
        // System.out.println("Knur got a raise of  " +knur.increaseSalary());

        //task2 Create new car in Main and assign it to human that you should already have.
//task 5 car chceck if you can buy it
        Car knurmobil = new Car ("Focus", "Ford", 2018, 3.6, 93000);
        knurmobil.plates = "WE 1234A";
        knur.car = knurmobil;
        System.out.println(knurmobil);
        System.out.println("Knur has a car " +knur.car.model);
        System.out.println(" with plates " + knur.car.plates);


        Car cityCar = new Car("cooper", "mini", 2016, 2.2, 93000);
        cityCar.plates = "PO G0";
        me.car = cityCar;
        System.out.println( " Kasia Pogo drives " +cityCar.producer);
        System.out.println(" with plates "+ cityCar.plates);


        Car electro = new Car("Tesla", "X", 2020, 6.6, 300000);
        electro.plates = "EL ZA";
        System.out.println("We have Tesla with plates " +electro.plates);

        //task buy sell
        Human carBuyer = new Human(5);
        carBuyer.firstName = "Janusz";
        carBuyer.lastName = "Nosacz";
        me.car.sell(carBuyer, me, 1234.00);
        System.out.println(me.car);
        System.out.println("The buyer named" + carBuyer.firstName + " paid me and still has" + carBuyer.cash + "PLN");

        CompareCars compare = new CompareCars();
        compare.compareCars(cityCar, knurmobil);
        compare.compareCars(cityCar, electro);

        String[] names = {"Kasia", "Knur", "Janusz"};
        for (String name : names) {
            System.out.println("my name is " + name);
        }
/*
        names = new String[4];

        Set<Object> humans = new TreeSet<>();

        humans.add(me);
        humans.add(knur);
        humans.add(me);
        humans.add(carBuyer);
        humans.add(new Animal("dog"));
*/
        //test task 7


        Connector.connect();

    }

}