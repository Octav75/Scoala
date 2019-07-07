package exercise4;

public class Car implements Vehicle {
    private CarBrand brand;
    private String model;

    public Car(CarBrand brand, String model){
        this.brand = brand;
        this.model = model;
    }

    public CarBrand getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}
