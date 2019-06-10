package concurrency;

public class StopWatchThread extends Thread {
    public void run (){
        for (int i = 0; i <= 10; i++){
            System.out.println(Thread.currentThread().getName()+ " " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
