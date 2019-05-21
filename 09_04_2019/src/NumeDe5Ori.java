import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.util.Scanner;

public class NumeDe5Ori {

    public static void main(String[] args) {

        ex5();}
//        ex4();
//        ex3();}
//        public static void ex3() {
//            int i = 0;
//
//            while (i < 7){
//                System.out.println("Octav."); // Atata timp cat i este mai mic decat 10 se printeaza Octav.
//                i++;
//        }
//    }
//
//}

//    public static void ex4() {
//        int i = 0;
//
//        while (i < 5) {
//        System.out.println("Infinit");
//    }
//
//}

    public static void ex5() {

        int i = 0;
        Scanner sc = new Scanner(System.in);

        while (i < 5){
        String text=sc.nextLine();
        System.out.println(text);
        i++;
        }
    }
}