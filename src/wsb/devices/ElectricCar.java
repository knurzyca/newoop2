package wsb.devices;

public class ElectricCar extends Car{
    public ElectricCar(String producer, String model, Integer year) {
        super(producer, model, year );
    }

    @Override
    public void refuel() {
        System.out.println("Refueled with electric power");
    }

    public String toString(){
        return "That is an electric car " + super.toString();
    }
}
