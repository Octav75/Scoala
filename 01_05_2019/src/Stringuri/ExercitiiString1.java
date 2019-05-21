package Stringuri;

public class ExercitiiString1 {

    public static void main(String[] args) {
        exercitiul1();
        exercitiul2();
        exercitiul3();
        exercitiul4();
        exercitiul5();
    }

    public static void exercitiul1(){
        String str = "mama";    // Declar variabila string cu denumirea str si valoarea mama.
        String strmare = str.toUpperCase(); // Declar o noua variabila strmare care are valoarea mama (str) cu litere mari
        System.out.println(strmare);    // Printez valoarea stringului strmare,care este mama cu litere mari.
    }

    public static void exercitiul2(){
        String a = "abc";
        String b = new String ("abc");
        System.out.println(a==b); // Este fals deoarece
        System.out.println(a.equals(b)); // Este adevarat, deoarece
    }

    public static void exercitiul3(){
        String mare = "MAMA";
        String mic = mare.toLowerCase(); // Variabila mic este stringul definit in variabila mare, dar convertit cu litere mici.
        System.out.println(mic);
    }

    public static void exercitiul4(){
        String m = "mama";  // Definesc stringul m
        String t = m.replace('m', 't'); // In stringul t am stringul m in care inlocuiesc m cu t
        System.out.println(t);
    }

    public static void exercitiul5(){
        String a = "Cristina este puia mea"; // Definesc un string a.
        String b = "mea"; // Definesc un string b
        boolean c = a.endsWith(b); // Verific daca stringul a se termina cu stringul b (mea) si declar variabila c de tip boolean.
        System.out.println(c); // Tiparesc variabila c de tip boolean care imi spune daca stringul a se termina cu caracterele din stringul b.
    }
}
