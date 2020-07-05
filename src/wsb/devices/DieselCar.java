package wsb.devices;

public class DieselCar extends Car{
    public DieselCar(String model, String producer, int year, double enginepower, double price) {
        super(producer, model, year, enginepower);
    }

    @Override
    public void refuel() {
        System.out.println("Refueled with diesel");
    }

    public String toString() {
        return "This is a  diesel car " + super.toString();
    }
}
