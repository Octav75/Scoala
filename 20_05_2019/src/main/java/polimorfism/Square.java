package polimorfism;

public class Square extends Shape implements Polygon{
    private int edgeSize;

    public Square(int edgeSize){
        this.edgeSize = edgeSize;
    }

    public void calculateArea(){
        System.out.println("Square: " + Math.pow(edgeSize , 2));
    }

    @Override
    public void getNoOfEdges() {
        System.out.println("Square edges");
    }
}
