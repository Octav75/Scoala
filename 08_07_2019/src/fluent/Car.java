package fluent;

public class Car {
    private int fabricationYear;
    private double price;
    private String brand;

    public Car(int fabricationYear, double price, String brand) {
        this.fabricationYear = fabricationYear;
        this.price = price;
        this.brand = brand;
    }

    public Car setFabricationYear(int fabricationYear){
        this.fabricationYear = fabricationYear;
        return this;
    }

    public Car setPrice(double price) {
        this.price = price;
        return this;
    }

    public Car setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public int getFabricationYear() {
        return fabricationYear;
    }

    public double getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }
}
