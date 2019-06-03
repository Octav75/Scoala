package javaCollections;

import java.util.*;

public class ExercitiCuColectii {
    public static void main(String[] args) {
        List<Integer> listaNumere = new ArrayList<>();
        listaNumere.add(12);
        listaNumere.add(45);
        listaNumere.add(65);
        listaNumere.add(23);
        listaNumere.add(12);

        System.out.println("Afisam folosind o bucla for: ");
        for (int i = 0; i < listaNumere.size(); i++) {
            System.out.println(listaNumere.get(i));
        }

        System.out.println("Afisam folosind o bucla foreach: ");
        for (Integer element : listaNumere) {
            System.out.println(element);
        }

        System.out.println("Afisam flolosind in iterator: ");
        Iterator<Integer> itr = listaNumere.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println(listaNumere); // lista.toString();

//        listaNumere.remove(3);
//        System.out.println(listaNumere);

        try {
            listaNumere.remove(6);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(listaNumere);

        for (int i = 0; i < listaNumere.size(); i++) {
            if (listaNumere.get(i) == 23) {
                listaNumere.remove(i);
            }
        }
        System.out.println(listaNumere);

        itr = listaNumere.iterator();
        while (itr.hasNext()) {
            if (itr.next() == 45) ;
            {
                itr.remove();
            }
        }
        System.out.println(listaNumere);

        List<Integer> listaInlantuita = new LinkedList<>();

        listaInlantuita.add(78);
        listaInlantuita.add(32);
        listaInlantuita.add(123);

        System.out.println("Lung. listei: " + listaInlantuita.size());
        listaInlantuita.add(13232);
        listaInlantuita.remove(3);

        listaNumere.addAll(listaInlantuita);
        System.out.println("Lista concatenata: " + listaNumere);

        if (listaNumere.contains(12)){
            System.out.println("Se regaseste: ");
        }
        else {
            System.out.println("Nu se regaseste: ");
        }

        Collections.sort(listaNumere);
        System.out.println(listaNumere);



        Map<Integer, String> hasMap = new HashMap<>();
        hasMap.put(14, "Andrei");
        hasMap.put(12, "Maria");
        hasMap.put(45, "Cris");

        System.out.println(hasMap.get(12));
    }
}

