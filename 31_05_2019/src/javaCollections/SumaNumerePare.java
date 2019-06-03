package javaCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SumaNumerePare {
    public static void main(String[] args) {
        List<Integer> listaNumere = new ArrayList<>();
        listaNumere.add(1);
        listaNumere.add(2);
        listaNumere.add(3);
        listaNumere.add(4);
        listaNumere.add(5);

//        int sum = 0;
//        for (int i = 0; i < listaNumere.size(); i++) {
//            if (listaNumere.get(i) %2 == 0){
//                sum += listaNumere.get(i);
//            }
//        }
//        System.out.println(sum);

        Iterator<Integer> itr = listaNumere.iterator();

        System.out.println("Lista: " + listaNumere);
        itr = listaNumere.iterator();
        Integer sum = 0;
        while (itr.hasNext()){
            Integer val = itr.next();
            if (val % 2 == 0){
                sum +=- val;
            }
        }

        System.out.println("Suma este: " + sum);
    }
}
