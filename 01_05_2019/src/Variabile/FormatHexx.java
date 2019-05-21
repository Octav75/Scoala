package Variabile;

public class FormatHexx {

    public static void main(String[] args) {    // Aceasta este clasa main care imi apeleaza diferitele exercitii (functii).
        ex1();
        ex2();
        ex3();
        ex4();

    }

    public static void ex1(){
        int i;  // Definesc variabila i de tip integer.
        i = 192; // Atribiu variabilei i valoarea 192.
        System.out.printf("%02x:", i); // Printez variabila i in format HEXX, cu : dupa valoare.
    }

    public static void ex2(){
        int i = 168; // Definesc varoiabila i de tip integer careia ii atribuii valoarea 168.
        System.out.printf("%02x:", i); // Printez variabila i in format HEXX, cu : dupa valoare.
    }

    public static void ex3(){
        int a;
        a = 1;
        System.out.printf("%02x:", a);
    }

    public static void ex4(){
        int a = 10;
        System.out.printf("%02x", a);   // Printez variabila i in format HEXX.
    }
}
