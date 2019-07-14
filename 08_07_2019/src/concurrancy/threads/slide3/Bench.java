package concurrancy.threads.slide3;

public class Bench {
    private int availebleSeats;

    public Bench(int availebleSeats) {
        this.availebleSeats = availebleSeats;
    }

    public void takeASeat() {
        if (availebleSeats > 0) {
            System.out.println("Take a seat");
            this.availebleSeats--;
            System.out.println("free seats: " + availebleSeats);
        } else {
            System.out.println("no more seats");
        }
    }
}