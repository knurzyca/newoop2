package wsb.devices;

public class DieselCar extends Car {
    public DieselCar(String producer, String model) {
        super(producer, model, 2020, 114.0, 3000);
    }
    /*@Override
    public void refuel() {
       System.out.println("Refueled with DIESEL");
    }


     */
   public String toString(){
        return "Not fast, but efficent";
    }


}
