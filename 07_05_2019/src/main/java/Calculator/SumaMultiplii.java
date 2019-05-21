package main.java.Calculator;

public class SumaMultiplii {
    public static void main(String[] args) {
//       String result = afiseazaUnMasaj();
//       System.out.println(afiseazaUnMasaj());
//    }
//
//    static String afiseazaUnMasaj(){
////        return "UN MESAJ";
//    }

        int sum = 0;
        int n = 1000;
        for (int numar = 0; numar < n; numar ++){
            if (isMultiplu5(numar) || isMultiplu3(numar));
                sum+=numar;
        }
//         return sum;


        boolean isMultiplu3;
        System.out.println(isMultiplu3(10));
        boolean isMultiplu5;
        System.out.println(isMultiplu5(11));
    }
        static boolean isMultiplu3(int a){
        int rest = a%3;
        if (rest == 0){
            return true;
        } else {
            return false;
        }
    }

        static boolean isMultiplu5(int b){
        int rest = b%5;
        if (rest == 0){
            return true;
        } else {
            return false;
        }
    }
}
