public abstract class Passenger {
    private String name;
    private String ID;
    private Car reserved_car;
    private double trip_cost;

    public Passenger() {

    }

    public Passenger(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setReserved_car(Car reserved_car) {
        this.reserved_car = reserved_car;
    }

    public void setTrip_cost(double trip_cost) {
        this.trip_cost = trip_cost;
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public Car getReserved_car() {
        return reserved_car;
    }

    public double getTrip_cost() {
        return trip_cost;
    }

    public abstract void reserve(Car car);


    public abstract void displayInformation();

}
