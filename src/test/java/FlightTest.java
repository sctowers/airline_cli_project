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
    void testRemovePassenger() {
        Passenger passenger = new Passenger("OE123", "Suzi", "sct@hotmail.co.uk");
        flight.addPassenger(passenger);
        flight.removePassenger("OE123");

        assertThat(flight.getPassengerHashMap()).???;
    }


}

