import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PassengerTest {
    private Passenger passenger;

    @BeforeEach

    public void setUp(){

        passenger = new Passenger("HUY789","Piraven","BobF@hotmail.com");
    }

    @Test
    public void canGetPassengerID(){

        assertThat(passenger.getPassengerID()).isEqualTo("HUY789");
    }
    @Test
    public void canGetPassengerName(){

        assertThat(passenger.getName()).isEqualTo("Piraven");
    }
    @Test
    public void canGetPassengerContactInfo(){

        assertThat(passenger.getContactInfo()).isEqualTo("BobF@hotmail.com");
    }
    @Test
    public void canSetPassengerID(){
        passenger.setPassengerID("hhh");
        assertThat(passenger.getPassengerID()).isEqualTo("hhh");
    }
    @Test
    public void canSetPassengerName(){
        passenger.setName("Suzi");
        assertThat(passenger.getName()).isEqualTo("Suzi");
    }
    @Test
    public void canSetPassengerContactInfo(){
        passenger.setContactInfo("Sunny@gmail.com");
        assertThat(passenger.getContactInfo()).isEqualTo("Sunny@gmail.com");
    }

    @Test
    public void canGetPassengerInfo(){
        String expectedInfo = "Name: Piraven PassengerID: HUY789 Passenger Contact Info: BobF@hotmail.com";
        assertThat(passenger.getPassengerInfo()).isEqualTo(expectedInfo);
    }

}
