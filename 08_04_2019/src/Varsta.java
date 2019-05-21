import java.util.Scanner;

public class Varsta {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Varsta:");
        int age = sc.nextInt();
            if (age < 18) {
            System.out.println("You are teenager!");}
        else if (age >100) {
            System.out.println("You are very old!");
        } else {
            System.out.println("You are adult!");
        }
    }
}
