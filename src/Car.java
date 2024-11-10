interface Serviceable{
    void service();
}
public class Car extends Vehicle implements Serviceable{
    private int passengers;


    public Car(String brand, String model, int year, int passengers){
        super(brand, model, year);
        this.passengers=passengers;
    }

    @Override
    public void move(){
        System.out.println(getBrand() + " " + getModel() + "is driving with " + passengers + " passengers");
    }

    @Override
    public void service(){
        System.out.println(getBrand() + " " + getModel() + " is being serviced");
    }


}
