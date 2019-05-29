package polimorfism;

public class Rectangle extends Shape implements Polygon{
    private int l;
    private int L;

    public Rectangle (int L, int l){
        this.L = L;
        this.l = l;
        double rectangle = l * L;
    }

    @Override
    public void calculateArea() {
        System.out.println("Rectangle Area");
    }

    @Override
    public void getNoOfEdges() {
        System.out.println("Rectangle Edges");
    }
}
