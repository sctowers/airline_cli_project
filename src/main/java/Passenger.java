public class Passenger {

    private String passengerID;
    private String name;
    private String contactInfo;

    public Passenger (String passengerID, String name, String contactInfo){
        this.contactInfo = contactInfo;
        this.name = name;
        this.passengerID = passengerID;
    }

    public String getPassengerInfo(){
        return "Name: "+ this.name +
                    " PassengerID: "+this.passengerID+
                    " Passenger Contact Info: "+this.contactInfo;
    }

    public String getPassengerID() {
        return passengerID;
    }

    public void setPassengerID(String passengerID) {
        this.passengerID = passengerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
}
