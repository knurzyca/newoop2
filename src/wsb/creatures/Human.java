package wsb.creatures;

import wsb.devices.Car;
import wsb.devices.ElectricCar;
import wsb.devices.Phone;

import java.util.Arrays;

public class Human extends Animal {
    private static final Double DEFAULT_FEED_WEIGHT = 1.0;
    public String firstName;
    public String lastName;
    double weight;
    public Animal pet; //task 1.1
    public Animal[] farm;
    //public FarmAnimal[] farm;
    public Phone mobile;
    public Car car; //tfor task 5
    private static int DEFAULT_FARM_SIZE = 3;
    protected String phoneNumber;
    public Double cash = 300.0;
    private Double salary;


    public Human(Integer farmSize) {
        super("homo sapiens");
        farm = new FarmAnimal[farmSize];
    }

   /* public Human() {
        super("homo sapiens");
        farm = new FarmAnimal[DEFAULT_FARM_SIZE];
        // garage = new Car[DEFAULT_GARAGE_SIZE]
    }

    */

    public Human(String firstName, String lastName, double weight, Animal pet, Car car , Phone mobile, double salary, double cash) {
        super("homo sapiens");
        this.firstName = firstName;
        this.lastName = lastName;
        this.weight = weight;
        this.pet = pet;
        this.car = car;
        this.mobile = mobile;
        this.salary = salary;
        this.cash = cash;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary <= 0) {
            System.out.println("you don't get paid");
            return;
        }
        System.out.println("New salary: " + salary);
        System.out.println("You got a raise - info to accounting system");
        System.out.println("remeber to take annex to agreement off Ms. Joanna from the office");
        System.out.println("Public Health Insurance and Tax Office got to know of your salary change and there is no use to hide your real income.");
        this.salary = salary;
    }

    /*public void sell() throws Exception {
        throw new Exception("don't do this");
    }

    public void eat() throws Exception {
        throw new Exception("don't do this ");
    }

    public void feed() {
        System.out.println("Human can use knife and fork - don't need to be feeded");
        super.feed(DEFAULT_FEED_WEIGHT);
    }

     */

    public void increaseSalary(double salary) {
        this.salary = salary;
    }

    public void setCash(double cash) { this.cash = cash;
    }

    /*public Double valueofCars(){
        Double value = 0.0;
        for (Car car :garage){
            if (car == null){
                value +=car.value;
            }
        }
    } */
    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        if (salary > getCar().price) {
            System.out.println("bought a car");
        } else if (salary > (getCar().price / 12)) {
            System.out.println("get credit to buy a car");
        } else {
            System.out.println("you need more money to buy it - find a new job or ask for the salary rise");
        }
    }
//tsk 7 test
    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", weight=" + weight +
                ", pet=" + pet +
                ", farm=" + Arrays.toString (farm) +
                ", mobile=" + mobile +
                ", car=" + car +
                ", cash=" + cash +
                ", salary=" + salary +
                '}';
    }
}
