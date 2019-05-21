import javafx.scene.transform.Scale;

import java.util.Scanner;

public class FIbFaraRecursivitate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

            int f1 = 0;
            int f2 = 1;
            int suma = 0;
            for (f1 = 0; f1 < n; f1++) {
                for (f2 = 1; f2 < n -1; f2++) {
                    suma = (f1-1) + (f2-2);
                }
            }
            System.out.println("Sirul lui Fibonacci nerecursiv este: " + suma);
        }
    }

