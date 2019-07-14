package concurrancy.threads.slide2;

public class DemoSlide2 {
    public static void main(String[] args) throws InterruptedException{
        StopWatchThread stopWatchThread = new StopWatchThread();
        stopWatchThread.start();
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + "starts");
        Thread.sleep(5000);
        System.out.println(threadName + "Starts");
        Thread.sleep(5000);
        System.out.println(threadName + "Starts");
    }
}
