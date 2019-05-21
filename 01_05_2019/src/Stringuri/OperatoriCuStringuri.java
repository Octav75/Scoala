package Stringuri;

public class OperatoriCuStringuri {
    public static void main(String[] args) {
        ex1();
    }

    public static void ex1(){
        String a = "abc"; // Variabilele a si b sunt identice "abc" si ocupa acelas spatiu de memorie.
        String b = "abc";
        String c = new String("abc"); // Variabila c este "abc", dar ocupa un alt spatiu in memorie, diferit de a si b.

        System.out.println(a==b); // Operatorul logic == compara zona de memorie ocupata de stringurile a si b.
        System.out.println(a.equals(b)); // Operatorul logic equals compara sirul de caractere intre string-urile a si b.
        System.out.println(b==c); // Operatorul logic == compara zona de memorie ocupata de stringurile b si c.
        // Dupa cum am vazut c este acelasi sir de caractere dar stocat in alta zona de memorie, deci rezultatul este fals.
        System.out.println(b.equals(c)); // Operatorul logic equals compara sirul de caractere intre string-urile b si c.
        // Variabila b contine acelasi sir de caractere (chiar daca in locatii diferite in memorie) deci comparatia intoarce true.
        System.out.println(c); // Pentru testare am vrut sa vad care este valoarea variabilei c.
    }
}
