package concurrency;

public class JoinExample extends Thread{
    public void run () {
        System.out.println("Sunt in threadul " + Thread.currentThread().getName());
    }
}
