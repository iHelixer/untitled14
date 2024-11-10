public class Truck extends Vehicle implements Serviceable{

    private double cargoWeight;


    public Truck(String brand, String model, int year, double cargoWeight){
        super(brand, model, year);
        this.cargoWeight=cargoWeight;
    }


    @Override
    public void move(){
        System.out.println(getBrand() + " " + getModel() + " is transporting " + cargoWeight + " tons of cargo");
    }

    @Override
    public void service(){
        System.out.println(getBrand() + " " + getModel() + " is undergoing maintenance");
    }



}
