package javaCollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;

public class ExercitiiCuSet {
    public static void main(String[] args) {

        Set<String> multime = new HashSet<>();
        multime.add("Andrei");
        multime.add("Cristina");
        multime.add("Octav");
        multime.add("Cristina");

        Iterator<String> iteratorSet = multime.iterator();
        while (iteratorSet.hasNext()){
            System.out.println(iteratorSet.next());
        }


    }
}
