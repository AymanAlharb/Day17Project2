import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Creating two routes.
        Route route1 = new Route("main raod", "not the main raod", 50);
        Route route2 = new Route("not the main raod", "main raod", 40);
        //Creating three cars to each passenger.
        Car car1 = new Car("11345", route1, 0);
        Car car2 = new Car("22345", route2, 3);
        Car car3 = new Car("44345", route1, 3);
        //A list of passengers.
        List<Passenger> passengers = new ArrayList<>();
        //Creating three passengers.
        Passenger nonSubscribed1 = new NonSubscribedPassenger("Ahmed", "111", true);
        Passenger nonSubscribed2 = new NonSubscribedPassenger("Ali", "222", false);
        Passenger subscribed1 = new SubscribedPassenger("Ali", "333");
        //Adding the passenger to the list.
        passengers.add(nonSubscribed1);
        passengers.add(nonSubscribed2);
        passengers.add(subscribed1);
        //Assigning a different car to each passenger.
        nonSubscribed1.reserve(car1);
        nonSubscribed2.reserve(car2);
        subscribed1.reserve(car3);
        //A loop to display the information of each passenger.
        for (Passenger passenger : passengers) passenger.displayInformation();
    }
}