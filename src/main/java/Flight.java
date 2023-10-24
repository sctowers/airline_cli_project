import java.util.HashMap;

public class Flight {

    private String flightID;
    private String destination;
    private HashMap<String, Passenger> passengerHashMap;

    public Flight(String flightID, String destination){
        this.flightID = flightID;
        this.destination = destination;
        this.passengerHashMap = new HashMap<>();
    }

    public void addPassenger(Passenger passenger){

        passengerHashMap.put(passenger.getPassengerID(), passenger);
    }

    public void removePassenger(String passengerID){
        passengerHashMap.remove(passengerID);
    }

    public void cancelFlight(){
        passengerHashMap.clear();
    }


    public String displayFlightInfo(){
        String passengerNameList = "";
        for (Passenger passenger : passengerHashMap.values()){
            passengerNameList += " - " + passenger.getName();
        }
        return "Flight ID: " + flightID + " " +
                "Destination: " + destination + " "+
                "Passengers on the flight: " + passengerNameList;

    }

    public String getFlightID() {
        return flightID;
    }

    public void setFlightID(String flightID) {
        this.flightID = flightID;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public HashMap<String, Passenger> getPassengerHashMap() {
        return passengerHashMap;
    }

    public void setPassengerHashMap(HashMap<String, Passenger> passengerHashMap) {
        this.passengerHashMap = passengerHashMap;
    }
}
