package main.java.tablainmultirii;

public class MultiplicationTable {

    public static void main(String[] args) {
        dysplayMultiplicationTable(8);
    }

    static void dysplayMultiplicationTable (int numar){
        System.out.println("dysplayMultiplicationTable");
        int produs;
        for (int i=1; i<=10; i++){
            produs = 8 * i;
            System.out.println(numar + "X" + i + "=" + produs);
        }
    }
}
