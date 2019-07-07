package exercise6;

import java.util.Objects;

public class Employee {
    private String nume;
    private String prenume;
    private int id;
    static int contor;

    public Employee(String nume, String prenume) {
        this.id = contor + 1;
        contor++;
        this.nume = nume;
        this.prenume = prenume;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                nume.equals(employee.nume) &&
                prenume.equals(employee.prenume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume, prenume, id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", id=" + id +
                '}';
    }
}
