package polimorfism;

public class Square {
    private int edgeSize;

    public Square(int edgeSize){
        this.edgeSize = edgeSize;
    }

    @Override
    public void calculateArea(){
        System.out.println("Square: " + Math.pow(edgeSize , 2));
    }
}
