package Stringuri;

public class StrBuilder {

    public static void main(String[] args) {
        //ex1();
        ex2();
    }

    public static void ex1(){

        String x = "abc"; // Declar o variabila x ca fiind un sir de caractere.
        String y = "d"; // Declar o variabila y ca fiind un alt sir de caractere.
        StringBuilder strBuilder = new StringBuilder(x); // Construiesc un nou sir de caractere, care de fapt va fi
        // componenta lui x dar cu alta locatie in memorie.
        System.out.println(strBuilder);
        strBuilder.append(y); // La sirul de caractere strBuilder adaug si sirul de caractere din sirul y.
        System.out.println(strBuilder);
        strBuilder.append(129921); // La sirul de caractere strBuilder (cel nou cu tot cu y) adaug alte caractere "129921"
        // ATENTIE: cand dau comanda .append trebuie sa fiu atent, deoarece trebuie sa aleg corect tipul de caracter pe care
        // doresc sa il introduc. Daca vreau char, sau int, sau boolean etc.
        System.out.println(strBuilder);
        strBuilder.append('f'); // Pentru a aduce numai un singur caracter care nu a fost definit anterior ca string
        // trebuie sa il introduc in ''.
        System.out.println(strBuilder);// Pentru a aduce mai multe caractere care nu a fost definite anterior ca string
        // trebuie sa le introduc in "".
        strBuilder.append("gg");
        System.out.println(strBuilder);
    }

    public static void ex2(){
        StringBuilder constructorSiruri = new StringBuilder ("Cris"); // Creez un sir de caractere.
        constructorSiruri.insert(4, "Octav");
        System.out.println(constructorSiruri);
    }
}
