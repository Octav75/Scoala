import java.util.Scanner;

public class Comutator2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti un numar intre 0 si 5");
        int nr = sc.nextInt();

        switch (nr) {
            case 0:
                System.out.println("*");
                break;
            case 1:
                System.out.println("$");
                break;
            case 2:
                System.out.println("(");
                break;
            default:
                System.out.println("Default");
        }
    }
}