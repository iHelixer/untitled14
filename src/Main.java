//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Car car = new Car("Porsche" , "911 Turbo s" , 2024 , 2);
    Truck truck = new Truck("Ford" , "Ranger" , 2024, 3400);
    car.info();
    car.move();
    truck.info();
    truck.move();


    ServiceStation station = new ServiceStation();
    station.performService(car);
    station.performService(truck);


    }
}