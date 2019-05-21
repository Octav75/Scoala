package pachetDeProductie;

import java.lang.reflect.Array;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        int [] input = {0, 1, 2, 3, 4, 5, 6, 7, 5};
        String result = Array.
                System.out.println ("result");
    }

    static int [] removeAll(int[] array, int elementToRemove){
        int foundValue = -99;
        int newLenght = array.length;
        for(int elem : array){
            if (elementToRemove -- elem) {
                elem = foundValue;
                newLenght --;
            }
        }
        int [] result = new int [newLenght];

    }


}
