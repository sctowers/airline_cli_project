import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AppTest{
    private App app = new App();
    ///private HashMap<String, Flight> flightList;

    Flight flight;
    Passenger passenger;
    Passenger passenger2;
    @BeforeEach

    void setUp(){
        flight = new Flight("HG789","Birmingham");

        passenger = new Passenger("HJHB123", "Suzi", "S@gmail.com");
        passenger2 = new Passenger("Hjvb123", "Piraven", "P@gmail.com");

        //app.addPassenger("HG789",passenger);
    }
    @Test
    void canAddFlight(){
        app.addFlight(flight.getFlightID(),flight);
        assertThat(app.getFlights().size()).isEqualTo(1);
    }
    @Test
    void canAddPassenger(){
        app.addFlight(flight.getFlightID(),flight);
        app.addPassenger(flight.getFlightID(),passenger);
        Flight plane = app.getFlight(flight.getFlightID());
        assertThat(plane.getPassengerHashMap().size()).isEqualTo(1);
    }

    @Test
    void canRemovePassenger(){

        app.addFlight(flight.getFlightID(),flight);
        app.addPassenger(flight.getFlightID(),passenger);
        app.addPassenger(flight.getFlightID(),passenger2);
        Flight plane = app.getFlight(flight.getFlightID());

        app.displayFlights();

        plane.removePassenger(passenger.getPassengerID());
        assertThat(plane.getPassengerHashMap().size()).isEqualTo(1);

    }

    @Test

    void canCancelFlight(){
        app.addFlight(flight.getFlightID(),flight);
        app.cancelFlight(flight.getFlightID());

        assertThat(app.getFlights().size()).isEqualTo(0);



    }



}