package inheritance;

public class Car extends Vehicle implements Paintable, Movable {

    @Override
    public int getSpeed() {
        return 100;
    }

    @Override
    public void paint() {
        System.out.println("Car paint");
    }

    @Override
    public void move() {

    }
}
