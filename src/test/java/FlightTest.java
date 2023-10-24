import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FlightTest {

    private Flight flight;

    @BeforeEach
    public void setUp() {

        flight = new Flight("KI293", "Budapest");
    }

    @Test
    public void canAddPassenger() {
        Passenger passenger = new Passenger("OE123", "Suzi", "sct@hotmail.co.uk");
        flight.addPassenger(passenger);

        HashMap<String, Passenger> expectedMap = new HashMap<>();
        expectedMap.put("OE123", passenger);

        assertThat(flight.getPassengerHashMap()).isEqualTo(expectedMap);
    }

    @Test
    public void canRemovePassenger() {
        Passenger passenger = new Passenger("OE123", "Suzi", "sct@hotmail.co.uk");
        flight.addPassenger(passenger);
        flight.removePassenger("OE123");

        assertThat(flight.getPassengerHashMap().size()).isEqualTo(0);
    }

    @Test
    public void canCancelFlight() {
        Passenger passenger = new Passenger("OE123", "Suzi", "sct@hotmail.co.uk");
        flight.addPassenger(passenger);
        flight.cancelFlight();

        assertThat(flight.getPassengerHashMap().size()).isEqualTo(0);
    }

    @Test
    public void canDisplayFlightInfo() {
        Passenger passenger1 = new Passenger("OE123", "Suzi", "sct@hotmail.co.uk");
        Passenger passenger2 = new Passenger("PR122", "Piraven", "pir@gmail.com");

        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);

        flight.displayFlightInfo();

        String expectedOutput = "Flight ID: KI293" +
                "Destination: Budapest" +
                "Passengers on the flight:  - Piraven - Suzi";
        assertThat(flight.displayFlightInfo()).isEqualTo(expectedOutput);
    }
}


