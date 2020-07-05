package wsb.devices;
import wsb.devices.Soldable;
import wsb.creatures.Human;

public class Car {
    public String model;
    public String producer;
    public int year;
    public double enginepower;
    public String plates;
    public double price;
    public Double value;

    public Car(String model, String producer, int year, double enginepower, double price) {
        this.model = model;
        this.producer = producer;
        this.year = year;
        this.enginepower = enginepower;
        this.price = price;
    }

    public Car(String producer, String model, int year, double enginepower) {
    }

    public Car(String producer, String model, Integer year) {
    }

    public void refuel() {

    }

    public void turnOn() {
        System.out.println("this car can start in 3..2..1..GO");
    }

    public String toString() {
        return this.producer + " " + this.model + " " + this.plates;
    }
    
    //task buy sell - "me" as a seller
    public void sell(Human buyer, Human seller, double price) throws Exception{
        if(!seller.hasACar(this)){
            throw new Exception("seller don't have a car");
        }
        if(!buyer.hasAFreePlace()){
            throw new Exception("bouer dont have a plase");
        }
        if(buyer.cash < price){
            throw new Exception("afwfwaawfawf");
        }
        buyer.removeCar(this);
        seller.addCar(this);
        buyer.cash -= price;
        seller.cash += price;
        System.out.println("great, transaction is done");
    }
}