import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        App app = new App();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Flight App Menu:");
                System.out.println("1. Create a new flight");
                System.out.println("2. Display all available flights");
                System.out.println("3. Create a passenger");
                System.out.println("4. Book a passenger onto a flight");
                System.out.println("5. Remove a passenger from a flight");
                System.out.println("6. Cancel a flight");
                System.out.println("7. Search for flight by destination");
                System.out.println("8. Exit from app");
                System.out.print("Enter your choice: ");

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {

                    case 1:
                        System.out.println("Enter Flight ID: ");
                        String flightID = scanner.nextLine();

                        if (!app.getFlightList().containsKey(flightID)) {
                            System.out.println("Enter Destination: ");
                            String destination = scanner.nextLine();
                            Flight newflight = new Flight(flightID, destination);
                            app.addFlight(flightID, newflight);
                            System.out.println("Flight " + flightID + " to " + destination + " added successfully.");
                        } else {
                            System.out.println("Flight ID is already in use!");
                        }
                        break;
                    case 2:
                        app.displayFlights();
                        break;
                    case 3:
                        System.out.println("Enter Passenger ID: ");
                        String passengerID = scanner.nextLine();
                        if (!app.getPassengers().containsKey(passengerID)) {
                            System.out.println("Enter Passenger Name: ");
                            String passengerName = scanner.nextLine();
                            System.out.println("Enter Passenger Contact info: ");
                            String contactInfo = scanner.nextLine();
                            Passenger newPassenger = new Passenger(passengerID, passengerName, contactInfo);
                            System.out.println("Passenger " + passengerName + " created successfully.");
                            app.createPassenger(passengerID, newPassenger);
                        } else {
                            System.out.println("PassengerID is already in use!");
                        }
                        break;
                    case 4:
                        System.out.println("Enter Flight ID to book passenger: ");
                        flightID = scanner.nextLine();
                        if (app.getFlightList().containsKey(flightID)) {
                            app.getFlight(flightID);
                            System.out.println("Enter PassengerID to book: ");
                            passengerID = scanner.nextLine();
                            if (app.getPassengers().containsKey(passengerID)) {
                                app.addPassenger(flightID, passengerID);
                                System.out.println("PassengerID " + passengerID + " added to flightID " + flightID);
                            } else {
                                System.out.println("PassengerID does not exist");
                            }
                        } else {
                            System.out.println("Flight ID does not exist");
                        }
                        break;
                    case 5:
                        System.out.println("Enter Flight ID to remove passenger: ");
                        flightID = scanner.nextLine();
                        if (app.getFlightList().containsKey(flightID)) {
                            app.getFlight(flightID);
                            System.out.println("Enter PassengerID to remove: ");
                            passengerID = scanner.nextLine();
                            if (app.getPassengers().containsKey(passengerID)) {
                                app.removePassenger(flightID, passengerID);
                                System.out.println("PassengerID " + passengerID + " removed from flightID " + flightID);
                            }
                        } else {
                            System.out.println("Flight ID does not exist!");
                        }
                        break;
                    case 6:
                        System.out.println("Enter Flight ID to cancel: ");
                        flightID = scanner.nextLine();
                        if (app.getFlightList().containsKey(flightID)) {
                            app.cancelFlight(flightID);
                            System.out.println("Flight " + flightID + " has been cancelled.");
                        } else {
                            System.out.println("FlightID does not exist!");
                        }
                        break;
                    case 7:
                        System.out.println("Enter destination to search: ");
                        String searchDesination = scanner.nextLine();
                        app.searchFlight(searchDesination);
                        break;
                    case 8:
                        System.out.println("Exiting Flight App.");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid input - please selection number 1-8");
                }
            }catch (Exception e){
                scanner.nextLine();
                System.out.println("An error occurred, please enter a valid number between 1-8");
            }
        }
    }
}
