package concurrency;

public class LovesMe extends Thread{
    public void run () {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + "Loves Me!!!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
