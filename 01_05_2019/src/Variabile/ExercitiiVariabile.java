package Variabile;

public class ExercitiiVariabile {   // aceasta este clasa (obiectul) de exercitii variabile care va executa ceea ce ii comanda METODA main.
    public static void main(String[] args) { // metoda care imi ruleaza programul. Care este o metoda publica si statica.
    exercitiul1();  //metoda main imi ruleaza functia exercituil1 si imi intoarce rezultatul acestei functii.
    exercitiul2(); // Intr-o metoda pot ca sa apelez diferite functii, ca in acest exemplu (apelez functia exercitiul2)
    exercitiul3();
    exercitiul4();
    exercitiul5();
    exercitiul6();
    exercitiul7();
    }

    public static void exercitiul1(){   // este o functie care nu intoarce nici un rezultat. Dar ma va ajuta sa apelez exervitiul1 in metoda maian.
        // Trebuie sa declar 2 variabule (una integer si una double) si  sa le printez.
        int i;  // Declar o variabila integer.
        double j;   // Declar o variabila double.

        i = 20; // Atribui variabilei de tip integer o valoare.
        j = 30.123; // Atribui variabilei de tip double o valoare.

        System.out.println(i);  // Printez valoarea variabilei de tip integer.
        System.out.println(j);  // Printez valoarea variabilei de tip double.

    }

    public static void exercitiul2(){   // Este o alta functie (care nu are legatura cu cea anterioara, care va fi rulata (apelata) de main.
        // Declat variabile de tip integer, printez valoarea maxima si minima pe care aceste variabile le pot avea.
        int i; // Declar prima variabila integer cu ajutorul careia voi printa valoarea maxima.
        int j; // Declar a doua variabila integer, deoarece lui "i" nu ii pot atribuii decat o valoare (Maximum), iar j ma va ajuta sa printez valoarea minima.

        i = Integer.MAX_VALUE; // Ii atribuii lui "i" valoare constantei MAX_VALUE = 2^31 - 1.
        j = Integer.MIN_VALUE; // Ii atribuii lui "j" valoare constantei MIN_VALUE = - 2^31.

        System.out.println(i); // Printez valoarea lui "i", adica cea  mai mare valoarea a unui integer dat de constanta MAX_VALUE
        System.out.println(j); // Printez valoarea lui "j", adica cea  mai mica valoarea a unui integer dat de constanta MIN_VALUE
    }

    public static void exercitiul3(){
        int i;
        i = Integer.MAX_VALUE + 1;
        System.out.println(i);
    }

    public static void exercitiul4(){
        double PI;
        PI = 3.14;
        System.out.println(PI);
    }

    public static  void exercitiul5(){
        long i; // Declar prima variabila long cu ajutorul careia voi printa valoarea maxima.
        long j; // Declar a doua variabila long, deoarece lui "i" nu ii pot atribuii decat o valoare (Maximum), iar j ma va ajuta sa printez valoarea minima.

        i = Long.MAX_VALUE; // Ii atribuii lui "i" valoare constantei MAX_VALUE = 2^63 - 1.
        j = Long.MIN_VALUE; // Ii atribuii lui "j" valoare constantei MIN_VALUE = - 2^63.

        System.out.println(i); // Printez valoarea lui "i", adica cea  mai mare valoarea a unui integer dat de constanta MAX_VALUE
        System.out.println(j); // Printez valoarea lui "j", adica cea  mai mica valoarea a unui integer dat de constanta MIN_VALUE
    }

    public static void exercitiul6(){
        double i; // Declar prima variabila integer cu ajutorul careia voi printa valoarea maxima.
        double j; // Declar a doua variabila integer, deoarece lui "i" nu ii pot atribuii decat o valoare (Maximum), iar j ma va ajuta sa printez valoarea minima.

        i = Double.MAX_VALUE; // Ii atribuii lui "i" valoare constantei MAX_VALUE = 2^31 - 1.
        j = Double.MIN_VALUE; // Ii atribuii lui "j" valoare constantei MIN_VALUE = - 2^31.

        System.out.println(i); // Printez valoarea lui "i", adica cea  mai mare valoarea a unui integer dat de constanta MAX_VALUE
        System.out.println(j); // Printez valoarea lui "j", adica cea  mai mica valoarea a unui integer dat de constanta MIN_VALUE
    }

    public static void exercitiul7(){
        byte i; // Declar prima variabila integer cu ajutorul careia voi printa valoarea maxima.
        byte j; // Declar a doua variabila integer, deoarece lui "i" nu ii pot atribuii decat o valoare (Maximum), iar j ma va ajuta sa printez valoarea minima.

        i = Byte.MAX_VALUE; // Ii atribuii lui "i" valoare constantei MAX_VALUE = 2^31 - 1.
        j = Byte.MIN_VALUE; // Ii atribuii lui "j" valoare constantei MIN_VALUE = - 2^31.

        System.out.println(i); // Printez valoarea lui "i", adica cea  mai mare valoarea a unui integer dat de constanta MAX_VALUE
        System.out.println(j); // Printez valoarea lui "j", adica cea  mai mica valoarea a unui integer dat de constanta MIN_VALUE
    }
}