public class OnlineMonitor {
    private CentralizedQueue queue;

    public OnlineMonitor(CentralizedQueue queue) {
        this.queue = queue;
    }

    public void displayCurrentNumber() {
        System.out.println("Current Queue Number: "
                + queue.getCurrentNumber());
    }
}
