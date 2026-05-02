public class Node {
    Ride ride;   // data
    Node next;   // pointer to next node

    // Constructor
    public Node(Ride ride) {
        this.ride = ride;
        this.next = null;
    }
}