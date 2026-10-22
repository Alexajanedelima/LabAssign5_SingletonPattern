import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CentralizedQueue queue = new CentralizedQueue();

        HelpDeskStation station1 = new HelpDeskStation(1, queue);
        HelpDeskStation station2 = new HelpDeskStation(2, queue);
        HelpDeskStation station3 = new HelpDeskStation(3, queue);

        OnlineMonitor monitor = new OnlineMonitor(queue);

        int choice;

        do {
            System.out.println("\nCENTRALIZED QUEUING SYSTEM");
            System.out.println("1. Help Desk 1 - Call Next");
            System.out.println("2. Help Desk 2 - Call Next");
            System.out.println("3. Help Desk 3 - Call Next");
            System.out.println("4. Reset Queue Number");
            System.out.println("5. Online Monitoring");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            choice = scanner.nextInt();

            if (choice == 1) {
                station1.callNext();
            } else if (choice == 2) {
                station2.callNext();
            } else if (choice == 3) {
                station3.callNext();
            } else if (choice == 4) {
                System.out.print("Select Help Desk (1-3): ");
                int station = scanner.nextInt();

                System.out.print("Enter new queue number: ");
                int number = scanner.nextInt();

                if (station == 1) {
                    station1.resetQueue(number);
                } else if (station == 2) {
                    station2.resetQueue(number);
                } else if (station == 3) {
                    station3.resetQueue(number);
                } else {
                    System.out.println("Invalid help desk.");
                }
            } else if (choice == 5) {
                monitor.displayCurrentNumber();
            } else if (choice == 6) {
                System.out.println("System closed.");
            } else {
                System.out.println("Invalid choice.");
            }

        } while (choice != 6);

        scanner.close();
    }
}
