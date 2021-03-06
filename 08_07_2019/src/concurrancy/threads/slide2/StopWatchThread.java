package concurrancy.threads.slide2;

public class StopWatchThread extends Thread {
    @Override
    public void run(){
        for (int i = 0; i < 10; i++){
            System.out.println(Thread.currentThread().getName() + "Stop Watch: " + i);
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                System.out.println("interrupted");
            }
        }
    }
}
