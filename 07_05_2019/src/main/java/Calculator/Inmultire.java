package main.java.Calculator;

public class Inmultire {
    public static void main(String[] args) {
        dysplayInmultire(2,3);
        displayDivizare(6,2);
        displaySuma(1, 4);
        displayDiferenta(5, 4);
    }

    static void dysplayInmultire (int a, int b){
        int produs = 1;
        produs = a * b;
        System.out.println("Produs = " + produs);
    }

    static void displayDivizare (int a, int b){
        int div = 1;
        div = a / b;
        System.out.println("Divizare = " + div);
    }

    static void displaySuma (int a, int b){
        int sum = 0;
        sum = a + b;
        System.out.println("Suma = " + sum);
    }

    static void displayDiferenta (int a, int b){
        int dif = 0;
        dif = a - b;
        System.out.println("Diferenta = " + dif);
    }
}
