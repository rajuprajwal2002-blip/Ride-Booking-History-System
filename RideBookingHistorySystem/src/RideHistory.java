public class RideHistory {
    private Node head;

    // 1. Add Ride (at end)
    public void addRide(Ride r) {
        Node newNode = new Node(r);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // 2. Delete Last Ride
    public void deleteLastRide() {
        if (head == null) {
            System.out.println("No rides to delete.");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
    }

    // 3. Display All Rides
    public void displayRides() {
        if (head == null) {
            System.out.println("No rides available.");
            return;
        }

        Node temp = head;
        while (temp != null) {
            temp.ride.displayRide();
            temp = temp.next;
        }
    }

    // 4. Search Ride by Location
    public void searchRide(String location) {
        Node temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.ride.getPickup().equalsIgnoreCase(location) ||
                temp.ride.getDrop().equalsIgnoreCase(location)) {

                temp.ride.displayRide();
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No rides found for: " + location);
        }
    }

    // 5. Reverse Ride History
    public void reverseHistory() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
    }
}