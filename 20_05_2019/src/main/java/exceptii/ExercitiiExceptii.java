package exceptii;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExercitiiExceptii {
    public static void main(String[] args) {

    Scanner nr = new Scanner(System.in);
        System.out.println("Introduceti Numarul:");
            int x;
            try {
                x = nr.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Input wrong, try again!");
                Scanner sc = new Scanner(System.in);
                x = sc.nextInt();
            }

    }

}
