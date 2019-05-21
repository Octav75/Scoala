package main.java.Calculator;

public class NumarPrim {
    public static void main(String[] args) {
        System.out.println(isPrime(12));
    }
    static boolean isPrime (int numar){
        for (int divizor = 2; divizor<numar; divizor++) {
            if (numar % divizor == 0) {
                return false;
            }
        } return true;
    }
}
