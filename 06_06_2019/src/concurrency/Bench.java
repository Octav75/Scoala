package concurrency;

public class Bench {
    private int availeblePlaces;
    public Bench (int availeblePlaces){
        this.availeblePlaces = availeblePlaces;
    }

    public synchronized void takeAPlace (){
        if (availeblePlaces > 0) {
            System.out.println("Taking a place");
            availeblePlaces --;
            System.out.println("There are only " + availeblePlaces + " place");
        } else {
            System.out.println("There are no places!");
        }
    }
}
