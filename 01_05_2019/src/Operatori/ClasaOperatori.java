package Operatori;

public class ClasaOperatori {

    public static void main(String[] args) {
        int x = 4;
        System.out.println(x++); // Incrementeaza cu 1 valoarea lui x (5) pe care o tine in memorie pentru o prelucrare ulterioara.
        System.out.println(x); // Printeaza valoarea din memorie (actualizata) a lui x.
        System.out.println(--x); // Deoarece se executa (citeste) de la stanga la dreapta, scadem 1 din valoarea din memorie,
                                // din 5 pe care o printam si o tinem in memorie.
        System.out.println(x); // printam valoarea din memorie, adica 5-1 = 4.
        System.out.println(x%3); // printam restul impartirii lui x la 3.
        System.out.println(11%3); //printam restul impartirii lui 11 la 3.
        System.out.println(x);  // Vreau sa verifica valoarea lui x din memorie.
        System.out.println(7%x++); // printam restul impartirii lui 7 la 4 (3) si il incrementam pe x cu 1 (5) pe care il tinem in memorie.
        System.out.println(x);
        System.out.println(x==4); // Il verific pe x daca este egal cu 4, ceea ce este fals, deoarece in memorie x = 5.
        System.out.println(x!=4); // Il verific pe x daca este diferit de 4, ceea ce este adevarat, deoarece in memorie x = 5.
        x = 10;
        int y = 5;
        System.out.println(x);
        System.out.println(y);
        System.out.println(x==10 && y <=5);
        System.out.println(x<=y && y>5);
        System.out.println("abc" instanceof String);

    }
}
