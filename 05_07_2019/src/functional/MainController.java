package functional;

import java.util.Scanner;

import static functional.PersonRepositoty.addPersons;

public class MainController {

    private PersonRepositoty personRepositoty;
// dependency injection;
    public MainController(PersonRepositoty personRepositoty) {
        this.personRepositoty = personRepositoty;
    }

    public static void main(String[] args) {
        displayMenu();

        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        dispatch(option);
    }

    private static void displayMenu() {
    }

    private static void dispatch(int option) {
        while (option != 0) {
            switch (option) {
                case 1:
                    addPersons();
                    break;
                default:
                    System.out.println("choose one of the options");
            }
        }
    }
}
