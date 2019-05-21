import java.util.Scanner;

public class Tema2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        switch (str){
            case "star":
                System.out.println("*");
                break;
            case "plus":
                System.out.println("+");
                break;
            default:
                System.out.println("Try again");
        }
    }
}
