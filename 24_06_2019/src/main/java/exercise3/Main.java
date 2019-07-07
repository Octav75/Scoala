package exercise3;

import javax.naming.Name;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Person> people = new LinkedList<>();

        String myPath = "D:\\SDA\\Scoala\\24_06_2019\\src\\main\\java\\exercise3\\PersonalData";
        Path filePath = Paths.get(myPath);
        List<String> persons = Files.readAllLines(filePath);
        for (int i = 1; i < persons.size(); i++){
            String linie = persons.get(i);
            String[] detalii = linie.split(" ");
//            System.out.println(detalii.length);
//            System.out.println(detalii[0]);
//            System.out.println(detalii[1]);
//            System.out.println(detalii[2]);
//            System.out.println(detalii[3]);
//            System.out.println();
            Person p = new Person(detalii[0], detalii[1], Integer.parseInt(detalii[2]), Integer.parseInt(detalii[3]));
            // Integer.paeseInt imi transforma stringul de varsta si numar de telefon in numere (daca aveam litere nu mergea.
            // Aici am adus persoanele din fisier.
            people.add(p);
        }

        for (Person person : people){
            System.out.println("Avem persoane: " + person.getName() + " " + person.getSurname() + " " + person.getAge() + " " + person.getPhoneNumber());
        }
    }
}

