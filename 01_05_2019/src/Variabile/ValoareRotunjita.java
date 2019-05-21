package Variabile;

import java.util.Scanner;

public class ValoareRotunjita {

    public static void main(String[] args) {

        exercitiul1();

    }

    public static void exercitiul1(){
        Scanner in = new Scanner(System.in); // Citesc de la tastatura
        double d = in.nextDouble(); // Citesc de la tastatura o variabila double pe care o denumesc d.
        double d1 = d * 100;
        int d2 = (int) d1;                  // Prelucrez valoarea de la tastatura d, pentru a obtine rotunjire
        int d3 = d2 / 100;                  // ... la 2 zecimale.
        double d4 = (double) d2 / 100;
        System.out.println(d4); // Printez valoarea d de la intrare numai cu primele 2 zecimale.

    }
}
