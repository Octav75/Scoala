package enumExercises;

public class Main {
    public static void main(String[] args) {
        Semaphore s = Semaphore.RED;
        switchSemafore (s);
//        Semaphore s2 = Semaphore.GREEN;
//        switchSemafore (s2);
//        Semaphore s3 = Semaphore.ORANGE;
//        switchSemafore (s3);
    }
    static void switchSemafore(Semaphore semaphore){
            switch (semaphore){
                case RED:
                    System.out.println("Stop");
                    break;
                case GREEN:
                    System.out.println("Mergi");
                    break;
                case ORANGE:
                    System.out.println("Mergi repede");
                    break;
            }
    }
}
