package wsb.devices;

import wsb.Saleable;
import wsb.creatures.Human;

public abstract class Device<price, value> implements Saleable {
    final public String producer;
    final public String model;
    double price;
    int yearOfProduction;

    public Device(String producer, String model, double price, int yearOfProduction) {
        this.producer=producer;
        this.model=model;
        this.price=price;
        this.yearOfProduction=yearOfProduction;
    }

    public abstract void turnOn();

    public String getModel(){
        return this.model;
    }

    @Override public void sell(){
        System.out.println("already sold");
    }

    @Override
    public void sell(Human buyer, Human seller, Double price) throws Exception {

    }
}