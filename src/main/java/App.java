import java.util.HashMap;

public class App {

    // createFlights
    private HashMap<String,Flight> flights;

    public App(){
        this.flights = new HashMap<>();
    }

    public HashMap<String, Flight> getFlights() {
        return flights;
    }

    public void addFlight(String flightID, Flight flight){
        this.flights.put(flightID,flight);
    }

    public void cancelFlight(String flightID){
        flights.remove(flightID);
    }

    public void addPassenger(String flightID, Passenger passenger){
        Flight plane = this.flights.get(flightID);
        plane.addPassenger(passenger);
    }

    public Flight getFlight(String flightID){
        return this.flights.get(flightID);
    }

    public void displayFlights(){

        for (Flight flight : flights.values()){
            System.out.println(flight.displayFlightInfo());
        }

    }
}
