import java.util.HashMap;
import java.util.Objects;

public class App {

    // createFlights
    private HashMap<String,Flight> flights;
    private HashMap<String,Passenger> passengers;

    public App(){

        this.flights = new HashMap<>();
        this.passengers = new HashMap<>();
    }

    public HashMap<String, Flight> getFlights() {
        return flights;
    }
    public HashMap<String, Passenger> getPassengers() {
        return passengers;
    }

    public void searchFlight(String destination){
        boolean found = false;
        for (Flight flight : flights.values()){

            if(Objects.equals(flight.getDestination(), destination)){
                System.out.println(flight.displayFlightInfo());
                found = true;
            }

        }
        if (!found){
            System.out.println("No available flights to this destination");
        }
    }
    public void addFlight(String flightID, Flight flight){
        this.flights.put(flightID,flight);
    }

    public void cancelFlight(String flightID){
        flights.remove(flightID);
    }

    public void addPassenger(String flightID, String passengerID){
        Passenger passenger = this.passengers.get(passengerID);
        Flight plane = this.flights.get(flightID);
        plane.addPassenger(passenger);
    }

    public void removePassenger(String flightID, String passengerID){
        Flight plane = this.flights.get(flightID);
        plane.removePassenger(passengerID);
    }
    public void createPassenger(String passengerID, Passenger passenger){
        this.passengers.put(passengerID, passenger);
    }

    public Flight getFlight(String flightID){
        return this.flights.get(flightID);
    }

    public void displayFlights(){

        for (Flight flight : flights.values()){
            System.out.println(flight.displayFlightInfo());
        }

    }

    public HashMap<String, Flight> getFlightList() {
        return flights;
    }
}
