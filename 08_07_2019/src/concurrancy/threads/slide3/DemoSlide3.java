package concurrancy.threads.slide3;

public class DemoSlide3 {
    Bench bench = new Bench(1);
    SeatTakerThread seatTaker1 = new SeatTakerThread(bench);
    SeatTakerThread seatTaker2 = new SeatTakerThread(bench);
    seatTaker1.start();
    seatTaker1.start();
}
