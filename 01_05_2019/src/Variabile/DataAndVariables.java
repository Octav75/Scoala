package Variabile;

import java.util.Scanner;

public class DataAndVariables {
    public static void main(String[] args) {
        exercitiul1();
        exercitiul2();

    }

    public static void exercitiul1(){
        int a;  // Citesc doua variabile integer si declar variabila s care va fi suma lor.
        int b;
        int s;
        a = 6;
        b = 11;
        s = a + b;

        System.out.println(s);  // Printez s, adica suma lor.
    }

    public static void exercitiul2(){
        Scanner citescdelatastatura = new Scanner(System.in); // Citesc de la tastatura (poate fi: Int, Double, Boolean, etc.)
        double d = citescdelatastatura.nextDouble();   // d este ceea ce citesc de la tastatura .next urmat de tipul variabilei pe care o citesc de la tastatura.
        System.out.println(d);
    }

}
