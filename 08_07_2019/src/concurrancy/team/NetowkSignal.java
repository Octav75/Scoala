package concurrancy.team;

enum NetowkSignal {

    // add states to enum
    /*
    - no signal
    - low
    - medium
    -high
     */

    NO_SIGNAL,
    LOW,
    MEDIUM,
    HIGH;

    public class Test {
        public void main(String[] args) {
            NetowkSignal ns1 = NetowkSignal.NO_SIGNAL;
            NetowkSignal ns2 = NetowkSignal.LOW;
            NetowkSignal ns3 = NetowkSignal.MEDIUM;
            NetowkSignal ns4 = NetowkSignal.HIGH;

            if (NO_SIGNAL == ns1) {
                System.out.println("Connection failed");
            } else {
                isConnected();
            }
        }
    }
    private void isConnected() {
    }
}
