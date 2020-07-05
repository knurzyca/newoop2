package wsb;

import wsb.creatures.Animal;
import wsb.creatures.Human;
import wsb.devices.Car;
import wsb.devices.Phone;
import wsb.devices.Device;

public class Main {

    public static void main(String[] args) throws Exception {
        //lesson1

        Animal dog = new Animal("dog");
        dog.name = "Szynek";

        Animal cat = new Animal("cat");
        cat.name = "Kulek";

        Phone szajsung = new Phone("Samsung", "s20", 5000.00);
        Phone knurofon = new Phone("Samsung", "S10", 3000.00);

        Human me = new Human();
        me.firstName = "Kasia";
        me.lastName = "Pogo";
        me.pet = dog;
        me.mobile = szajsung;
        me.setSalary(10000.00);  //task3 Salary
        System.out.println("I earn " +me.getSalary() +"PLN");
        me.setCash(100000.00);


        System.out.println("I have " + me.cash + "PLN of extra cash");
        me.increaseSalary(1230.00);

        Car cityCar = new Car("cooper", "mini", 2016, 2.2, 93000);
        cityCar.plates = "PO G0";
        me.car = cityCar;
        System.out.println( " Kasia Pogo drives " +cityCar.producer +cityCar.model + " with plates " + cityCar.plates);





        Human knur = new Human();
        knur.firstName = "Knuroslaw";
        knur.lastName = "Knurski";
        knur.pet = cat;
        // knur.pet.feed();
        // System.out.println(cat);

        knur.mobile = knurofon;
        knur.setSalary(5000.00);
        System.out.println("Knur earns " +knur.getSalary());
        knur.increaseSalary(1000.00);

        knur.setCash(100000.00);
        System.out.println("Knur has " + knur.cash + "PLN of extra cash");



        Car knurmobil = new Car ("Focus", "Ford", 2018, 3.6, 93000);
        knurmobil.plates = "WE 1234A";
        knur.car = knurmobil;
        System.out.println(knurmobil);
        System.out.println("Knur has a car " +knur.car.model);
        System.out.println(" with plates " + knur.car.plates);


        Car electro = new Car("Tesla", "X", 2020, 6.6, 300000);
        electro.plates = "EL ZA";
        System.out.println(" We have " +electro.model + " with plates " +electro.plates +" which costs" +electro.price);



        Human kupiec = new Human();
        kupiec.firstName = "Janusz";
        kupiec.lastName = "Nosacz";
        kupiec.cash = 1000000;
        kupiec.pet = dog;


        me.car.sell(kupiec, me, 2220.0);

        System.out.println("I currently have " + me.cash    + "PLN");
        System.out.println("Car Buyer has" + kupiec.cash + "PLN");
        System.out.println("Car Buyer owns now  " +cityCar);
        System.out.println("The buyer named" + kupiec.firstName + " paid me and still has" + kupiec.cash + "PLN");


    }


}