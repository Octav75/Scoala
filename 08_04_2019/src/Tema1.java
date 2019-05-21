import java.util.Scanner;

public class Tema1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (str.equals("star")){
            System.out.println("*");
        } else if (str.equals("plus")) {
            System.out.println(("+"));
        } else {
            System.out.println("try again");
        }
    }


}
