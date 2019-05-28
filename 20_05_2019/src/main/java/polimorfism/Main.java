package polimorfism;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle (3);
        Shape rectangle = new Rectangle(4,5);
        Shape square = new Square(10);

        Shape[] shapes = {circle, rectangle, square};

        for (Shape s : shapes){
            s.calculateArea();
        }

        for (Shape s : shapes){
            if(s instanceof Polygon){
                Polygon poly = (Polygon) s; //if s is Polygon we can cast and create a polygon
                poly.getNoOfEdges();
            }
        }
    }

}
