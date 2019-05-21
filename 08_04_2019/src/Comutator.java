import java.util.Scanner;

public class Comutator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char direction = sc.nextLine().charAt(0);

        switch (direction) {
            case 'n':
                System.out.println("You are going Nort");
                break;
            case 's':
                System.out.println("You are going South");
                break;
            case 'e':
                System.out.println("You care going East");
                break;
            case 'w':
                System.out.println("You are going West");
                break;
            default:
                System.out.println("Bad Direction");
        }

    }
}