package wsb.devices;

public class CompareCars {
    public void compareCars(Car car1, Car car2){
        if (car1.equals(car2)){
            System.out.println("these care are the same");
        }else{
            System.out.println("cars are not the same\n" + "First car is: " + car1 + "\nSecond car is " + car2 );
        }
    }
}
