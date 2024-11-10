public abstract class Vehicle {
    private String brand;
    private String model;
    private int year;

    public Vehicle(String brand, String model, int year){
        this.brand=brand;
        this.model=model;
        this.year=year;
    }

    public java.lang.String getBrand() {
        return brand;
    }

    public void setBrand(java.lang.String brand) {
        this.brand = brand;
    }

    public java.lang.String getModel() {
        return model;
    }

    public void setModel(java.lang.String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public abstract void move();
    public void info(){
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
    }


}

