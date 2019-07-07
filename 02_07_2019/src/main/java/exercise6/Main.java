package exercise6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        Map<String, String> map = new HashMap<>();
//        map.put("Ion", "Ioana");
//        map.put ("Vasile", "Vasilica");
//        map.put("Marin", "Maria");
//        System.out.println(map.get("Ion"));
//        map.put("Ion", "OC");
//        System.out.println(map.get("Ion"));

        Map<Employee, Manager> departamente = new HashMap<>();
        Employee e1 = new Employee("Ion", "Ion");
        Employee e2 = new Employee("Vasile", "Vasile");
        Employee e3 = new Employee("OC", "CO");
        Manager m1 = new Manager("Ioana", "Ioana");
        Manager m2 = new Manager ("Vasilica", "Vasilica");
        departamente.put(e1, m1);
        departamente.put(e2, m2);
        System.out.println(e3.getId());
        System.out.println(departamente.get(e1));
        System.out.println(departamente.get(e2));

        Map<Manager, List<Employee>> departamente1 = new HashMap<>();

//        Employee e1 = new Employee("Ion", "Ion");
//        Employee e2 = new Employee("Vasile", "Vasile");
//        Employee e3 = new Employee("OC", "CO");
//        Manager m1 = new Manager("Ioana", "Ioana");
//        Manager m2 = new Manager ("Vasilica", "Vasilica");

        List<Employee> employeeList1 = new ArrayList<>();
        List<Employee> employeeList2 = new ArrayList<>();
        employeeList1.add(e1);
        employeeList1.add(e2);
        employeeList2.add(e3);

        departamente1.put(m1, employeeList1);
        departamente1.put(m2, employeeList2);

//        System.out.println(employeeList1);

//        Manager m = employeeList1.get(e1);
//        List<Employee> employees = managerList.get(m);

        System.out.println(departamente1.get(m1));
        System.out.println(departamente1.get(m2));
    }
}
