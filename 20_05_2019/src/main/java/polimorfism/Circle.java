package polimorfism;

public class Circle extends Shape {
    private int radius;

    public Circle (int radius){
        this.radius = radius;
        double circle = Math.PI * radius * radius;
    }

    @Override
    public void calculateArea() {
        System.out.println("Cirle Area");
    }
}
