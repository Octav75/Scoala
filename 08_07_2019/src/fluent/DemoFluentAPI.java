package fluent;

public class DemoFluentAPI {
    public static void main(String[] args) {
        Car car = new Car(2019, 5000, "Dacia");
        Car carWithYear = car.setFabricationYear(2018);
        Car carWithBrand = carWithYear.setBrand("Logan");
        carWithBrand.setPrice(4000);

        car.setFabricationYear(2005)
                .setBrand("Honda");
//                .setPrice(1000);
    }
}
