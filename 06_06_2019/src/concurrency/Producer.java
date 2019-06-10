package concurrency;

public class Producer extends Thread {
    private Message msg;
    public Producer(Message msg) {
        this.msg = msg;
    }

    @Override
    public void run () {
        String numeThread = Thread.currentThread().getName();
        msg.setMessage (numeThread);
        try {
            synchronized (msg) {
                Thread.sleep(1000);
                System.out.println("Threadul Producer a transmis mesajul" + msg + " la momentul" +System.currentTimeMillis());
                msg.notify();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Producerul a terminat");
    }
}
