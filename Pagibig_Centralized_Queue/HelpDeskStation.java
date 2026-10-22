public class HelpDeskStation {
    private int stationNumber;
    private CentralizedQueue queue;

    public HelpDeskStation(int stationNumber, CentralizedQueue queue) {
        this.stationNumber = stationNumber;
        this.queue = queue;
    }

    public void callNext() {
        int number = queue.getNextNumber();

        System.out.println("Help Desk " + stationNumber
                + " is serving Queue Number: " + number);
    }

    public void resetQueue(int number) {
        queue.resetNumber(number);

        System.out.println("Help Desk " + stationNumber
                + " reset the queue to: " + queue.getCurrentNumber());
    }
}
