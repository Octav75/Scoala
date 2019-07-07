package exercise4;

import java.time.LocalDate;

public class Person {
    private String surname;
    private String name;
    private LocalDate dateOfBirth;

    public Person(String surname, String name, LocalDate dateOfBirth) {
        this.surname = surname;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
}
