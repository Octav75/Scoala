package concurrency;

public class Consumer extends Thread {
    public Message msg;
    public Consumer(Message msg){
        this.msg = msg;
    }

    @Override
    public void run (){
        System.out.println("Consumerul a inceput");
        try {
            synchronized (msg) {
                System.out.println("Consumerul asteapta...");
                msg.wait();
            }
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Mesajul a fost primit mesajul" + msg.getMessage());
        System.out.println("Consumerul a terminat");
    }
}
