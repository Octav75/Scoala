public class While {

    public static void main(String[] args) {

        ex2();
        ex1();

    }
    public static void ex1() {
        while (true) {
            System.out.println("Test");  //printeaza test in bucla infinita
        }
    }

    public static void ex2(){

            int x = 3;
            while (x > 1) {
                System.out.println(x);  // atata timp cat conditia este indeplinita (x > 1) il printeaza pe x
                x--;
            }
        }
}
