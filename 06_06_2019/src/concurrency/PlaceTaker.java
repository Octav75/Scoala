package concurrency;

public class PlaceTaker extends Thread {

    private  Bench bench;
    public PlaceTaker (Bench b) {
        this.bench = b;
    }

    public void run () {
        bench.takeAPlace();
    }
}
