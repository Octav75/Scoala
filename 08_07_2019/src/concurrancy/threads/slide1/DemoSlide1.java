package concurrancy.threads.slide1;

public class DemoSlide1 {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
//        System.out.println(threadName);
        try {
            Thread.sleep(300);
            Thread.currentThread().interrupt();
        } catch (InterruptedException e) {
            System.out.println("thread intreupted");
        }
    }
}
