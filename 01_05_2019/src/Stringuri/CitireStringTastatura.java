package Stringuri;

import java.util.Scanner;

public class CitireStringTastatura {
    public static void main(String[] args) {
        // ex1();
        // ex2();
        ex3();
    }

    public static void ex1(){
        // Introducerea de la tastatura a unui sir de caractere.
        System.out.println("Introduceti un string de la tastatura: "); // Tiparesc un mesaj pentru a stii ca trebuie sa introduc un sir de caractere de la tastatura.
        Scanner scn =  new Scanner(System.in); // System.in este comanda de a introduce caractere de la tastatura.
        String inputString = scn.nextLine(); // Definesc ce tip de caracter introduc de la tastatura (String/Integer...),
        // Aceasta este comanda predefinita de a introduce de la tastatura stringuri, dar pot introduce si double, integer, etc.
        System.out.println("String-ul citit de la tastatura este: \n" + inputString); // Printez inputString
        // adica stringul de caractere pe care l-am introdus de la tastatura.
    }

    public static void ex2(){
        // Inroducerea de la tastatura a unor numere intregi.
        System.out.println("Introduceti numere de la tastatura ");
        Scanner sc = new Scanner(System.in); // Declar faptul ca vreau sa introduc niste caractere de la tastatura.
        Integer introduInteger = sc.nextInt(); // Definesc ce tip de caracter introduc de la tastatura Integer.
        System.out.println("Numarul introdus de la tastatura este: \n" + introduInteger);
        // Printez numarul introdus de la tastatura, adica "introduInteger" pe care cu ajutorul comenzii \n
        // CARE TREBUIE SA FIE IN INTERIORUL GHILIMELELOR, il voi tiparii pe linia urmatoare (de sub) "Numarul introdus de la tastatura este:".
    }

    public static void ex3(){
        System.out.println("Introduceti un numar cu zecimala de la tastatura: ");
        Scanner a = new Scanner(System.in);
        Double b = a.nextDouble();
        System.out.println("Nr. cu zecimala introdus de la tastatura este: \n" + b );
    }

}
