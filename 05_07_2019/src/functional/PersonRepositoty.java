package functional;

import java.util.Scanner;

public class PersonRepositoty {
    static void addPersons() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Who's next? (press 'n' if all are ready");

            String name = scanner.nextLine();

            int min = 1;
            int max = 5;
            int randomDifficulty = RandomizerApp.getRandomNumberInRange(min, max);
            Person person = new Person(name, randomDifficulty);
            person.setPresent(true);

            RandomizerApp.people.add(person);
        }
    }
}
