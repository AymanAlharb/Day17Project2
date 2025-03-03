public class Car {
    private String code;
    private Route route;
    private int max_num_of_passengers;

    public Car(String code, Route route, int max_num_of_passengers) {
        this.code = code;
        this.route = route;
        this.max_num_of_passengers = max_num_of_passengers;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public void setMax_num_of_passengers(int max_num_of_passengers) {
        this.max_num_of_passengers = max_num_of_passengers;
    }

    public String getCode() {
        return code;
    }

    public Route getRoute() {
        return route;
    }

    public int getMax_num_of_passengers() {
        return max_num_of_passengers;
    }
}
