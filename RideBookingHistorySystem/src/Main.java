import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        RideHistory history = new RideHistory();

        int choice;

        do {
            System.out.println("\n===== Ride Booking History System =====");
            System.out.println("1. Add Ride");
            System.out.println("2. Delete Last Ride");
            System.out.println("3. Display All Rides");
            System.out.println("4. Search Ride by Location");
            System.out.println("5. Reverse Ride History");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    System.out.print("Enter Ride ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Pickup Location: ");
                    String pickup = sc.nextLine();

                    System.out.print("Enter Drop Location: ");
                    String drop = sc.nextLine();

                    System.out.print("Enter Fare: ");
                    double fare = sc.nextDouble();

                    history.addRide(new Ride(id, pickup, drop, fare));
                    System.out.println("✅ Ride added successfully!");
                    break;

                case 2:
                    history.deleteLastRide();
                    System.out.println("✅ Last ride deleted!");
                    break;

                case 3:
                    System.out.println("\n📋 Ride History:");
                    history.displayRides();
                    break;

                case 4:
                    System.out.print("Enter location to search: ");
                    String location = sc.nextLine();
                    history.searchRide(location);
                    break;

                case 5:
                    history.reverseHistory();
                    System.out.println("✅ Ride history reversed!");
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("❌ Invalid choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}