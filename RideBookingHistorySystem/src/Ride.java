public class Ride {
    private int rideId;
    private String pickup;
    private String drop;
    private double fare;

    public Ride(int rideId, String pickup, String drop, double fare) {
        this.rideId = rideId;
        this.pickup = pickup;
        this.drop = drop;
        this.fare = fare;
    }

    public String getPickup() {
        return pickup;
    }

    public String getDrop() {
        return drop;
    }

    public void displayRide() {
        System.out.println("Ride ID: " + rideId +
                " | Pickup: " + pickup +
                " | Drop: " + drop +
                " | Fare: ₹" + fare);
    }
}