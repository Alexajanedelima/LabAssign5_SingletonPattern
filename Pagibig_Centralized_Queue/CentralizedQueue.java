public class CentralizedQueue {
    private int currentNumber = 0;

    public synchronized int getNextNumber() {
        currentNumber++;
        return currentNumber;
    }

    public synchronized void resetNumber(int number) {
        if (number >= 0) {
            currentNumber = number;
        } else {
            System.out.println("Invalid queue number.");
        }
    }

    public synchronized int getCurrentNumber() {
        return currentNumber;
    }
}
