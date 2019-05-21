public class SumaRecRazv {
    public static void main(String[] args) {
        System.out.println("suma recursiva este: " + sumaRec(5));
    }
    static int sumaRec (int n){
        int suma = 0;
        if (n == 0){
            return suma;
        }
        return n + sumaRec(n - 1);
    }
}
