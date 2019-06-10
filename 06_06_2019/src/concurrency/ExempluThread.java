package concurrency;

public class ExempluThread {
    public static void main(String[] args) {

//        StopWatchThread stopWatch = new StopWatchThread();
//        Thread t1 = new Thread(stopWatch, "StopWatch1");
//        Thread t2 = new Thread(stopWatch, "StopWatch2");
//        t1.setDaemon(true);
//        t2.setDaemon(true);
//        t1.start();
//        t2.start();
//
//        System.out.println("Threadul principal a pornit");
//        try {
//            Thread.sleep(3000);
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }
//        System.out.println("Threadul principal ruleaza");
//
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e){
//            e.printStackTrace();
//        }
//        System.out.println("Main thread ends.");

//        StopWatchRunnable stopWatchRunnable = new StopWatchRunnable();
//        Thread t1 = new Thread (stopWatchRunnable, "stopWastchRunnable");
//        t1.start();

//        LovesMe lovesMe = new LovesMe();
//        LovesMeNot lovesMeNot = new LovesMeNot();
//        Thread t1 = new Thread(lovesMe, "Loves Me!!!");
//        Thread t2 = new Thread(lovesMeNot, "Loves Me Not?");
//        t1.start();
//        t2.start();

//        JoinExample jE = new JoinExample();
//        Thread t1 = new Thread(jE, "Thread 1");
//        Thread t2 = new Thread(jE, "Thread 2");
//        Thread t3 = new Thread(jE, "Thread 3");
//        t1.setDaemon(true);
//        t2.setDaemon(true);
//        t1.start();
//        t2.start();
//        t3.start();

//        t1.start();
//        // asteapta 5 secunde sau primul thread;
//        try {
//            t1.join(5000);
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }
//
//        t2.start();
//        // asteapta terminarea celui de al doilea thread = join () = fara timp;
//        try {
//            t2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        t3.start();
//        // asteapta terminarea celor trei threaduri inainte de a incepe;
//        try {
//            t3.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

//        Bench bench = new Bench(2);
//        Thread t1 = new Thread(new PlaceTaker(bench));
//        Thread t2 = new Thread (new PlaceTaker(bench));
//        Thread t3 = new Thread(new PlaceTaker(bench));
//        t1.start();
//        t2.start();
//        t3.start();

        Message msg = new Message("Text1");
        Consumer consumator = new Consumer(msg);
        Producer producator = new Producer(msg);
        Thread t1 = new Thread(consumator, "cons");
        Thread t2 = new Thread(producator, "prod");

        t1.start();
        t2.start();

    }
}
