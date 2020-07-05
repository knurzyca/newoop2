package wsb.creatures;

import wsb.devices.Car;
import wsb.devices.ElectricCar;
import wsb.devices.Phone;

import java.util.Arrays;

public class Human extends Animal {
    private static final Double DEFAULT_FEED_WEIGHT = 1.0;
    public String firstName;
    public String lastName;
    public Animal pet; //task 1.1
    public Animal[] farm;
    public Phone mobile;
    public Car car; //tfor task 5
    public double cash = 300.0;
    private Double salary;


   public Human() {
        super("homo sapiens");
    }

    public Double getSalary() {
        return salary;
    }
    public void sell() throws Exception {
        throw new Exception("don't do this - selling human is illegal");
    }

    public void eat() throws Exception {
        throw new Exception("don't do this ");
    }

    public void feed() {
        System.out.println("Human can use knife and fork - don't need to be feeded");

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

    public void increaseSalary(double salary) {
        this.salary = salary;
    }

    public void setCash(double cash) { this.cash = cash;
    }
    public String toString() {
        return this.firstName + " " + this.lastName;
    }

}
