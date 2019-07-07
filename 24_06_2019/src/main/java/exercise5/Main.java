package exercise5;

import java.util.ArrayList;
import java.util.List;

//public class Main {
//    public static void main(String[] args) {
//        int n = 10;
//        char[] horizontalLine = new char[n];
//        int i = 0;
//        for (i = 0; i < horizontalLine.length; i++) {
//            horizontalLine[i] = '*';
//        }
//        System.out.println(horizontalLine); // Cu generice

//        AsterixHorizontal horizontalLine = new AsterixHorizontal();
//        for (int i = 0; i < 9; i++){
//            horizontalLine.add(i, "*");
//        }
//        System.out.println(horizontalLine); // linie orizontala
//
//        AsterixVertical verticalLine = new AsterixVertical();
//        for (int i = 0; i < 9; i++){
//            verticalLine.add(i, "*");
//        }
//        System.out.println(verticalLine); // linie verticala

//        List<List<String>>;
//        List<AsterixHorizontal> list = new ArrayList<AsterixHorizontal>();
//        for (int i = 0; i < 10; i++) {
//            AsterixHorizontal aH = new AsterixHorizontal();
//            for (int j = 0; j < 10; j++) {
//                aH.add("*");
//            }
//            list.add(aH);
//        }
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//    }
//}


// Profa:

public class Main {

    public static void main(String[] args) {

        Matrix matrix = new Matrix();
        matrix.addLine();
        matrix.removeLine();
        matrix.removeLine();

        System.out.println("Add remove remove line: \n" + matrix.toString());


        matrix.addLine();
        matrix.addLine();
        matrix.addLine();

        matrix.addColumn();
        matrix.addColumn();
        matrix.addColumn();

        System.out.println("3 x 3 matrix: \n" + matrix.toString());

        matrix.removeColumn();

        System.out.println("After removing 1 column: \n" + matrix.toString());

        matrix.removeLine();

        System.out.println("After removing 1 line: \n" + matrix.toString());

    }
}