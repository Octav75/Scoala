package javaCollections;

import java.util.HashMap;
import java.util.Map;

public class MainAngajati {
    public static void main(String[] args) {
        Map<Integer, String> hasMap = new HashMap<>();
        hasMap.put(14, "Andrei");
        hasMap.put(12, "OC");

        System.out.println(hasMap.get(12));

        Angajati angajati1 = new Angajati(1L, "Ioan", "it", false);
        Angajati angajati2 = new Angajati();
        angajati2.initializeaza(2L, "Marc", "conta", true);

        Map<Long, String> angajati = new HashMap<>();

        angajati.put(angajati1.getId(), angajati1.getName());
        angajati.put(angajati2.getId(), angajati2.getName());

        for (Map.Entry<Long, String> entry : angajati.entrySet()){
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        Map<String, Angajati> angajatiMap = new HashMap<>();
        angajatiMap.put(angajati1.hash(), angajati1);
        angajatiMap.put(angajati2.hash(), angajati2);

        for (Map.Entry<String, Angajati> entry : angajatiMap.entrySet());

    }
}
