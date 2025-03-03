public class Route {
    private String starting_address;
    private String destination;
    private double trip_price;

    public Route(String starting_address, String destination, double trip_price) {
        this.starting_address = starting_address;
        this.destination = destination;
        this.trip_price = trip_price;
    }

    public void setStarting_address(String starting_address) {
        this.starting_address = starting_address;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setTrip_price(double trip_price) {
        this.trip_price = trip_price;
    }

    public String getStarting_address() {
        return starting_address;
    }

    public String getDestination() {
        return destination;
    }

    public double getTrip_price() {
        return trip_price;
    }
}
