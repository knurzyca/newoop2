package wsb.devices;

// import wsb.Soldable;
// import wsb.creatures.Human;

import wsb.creatures.Human;

public class Car {
    public String model;
    public String producer;
    public int year;
    public double enginepower;
    public String plates;
    public double price;

    public Car(String model, String producer, int year, double enginepower, double price) {
        this.model = model;
        this.producer = producer;
        this.year = year;
        this.enginepower = enginepower;
        this.price = price;
    }

    //task buy sell - "me" as a seller
    public void sell(Human carBuyer, Human me, double price) throws Exception{
        if (carBuyer.cash >= price) {
            carBuyer.car = this;
            carBuyer.cash -= price;
            me.car = null;
            me.cash += price;
            System.out.println(me.firstName + " sell a car (" + this.model + ") to " + carBuyer + " for " + price);
        } else {
            throw new Exception("sorry, your funds are not enough");
        }
    }


    // public void refuel();
}