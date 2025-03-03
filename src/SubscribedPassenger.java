public class SubscribedPassenger extends Passenger {

    public SubscribedPassenger(String name, String ID) {
        super(name, ID);
    }

    @Override
    public void reserve(Car car) {
        if (car.getMax_num_of_passengers() == 0) System.out.println("The car is full of passengers.");
        else {
            car.setMax_num_of_passengers(car.getMax_num_of_passengers()-1);
            this.setTrip_cost(car.getRoute().getTrip_price() * 0.50);
            this.setReserved_car(car);
        }
    }

    @Override
    public void displayInformation() {
        System.out.println("Subscribed Passenger: \n\tname: " + this.getName() + "\n\tID: " + this.getID());
        if(getReserved_car() != null) System.out.println("\tCar Code: " + this.getReserved_car().getCode() +
                "\n\tRoute Cost: " + this.getTrip_cost());
        else System.out.println("This passenger does not have a reserved car.");
        System.out.println();
    }

}
