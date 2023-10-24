import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        App app = new App();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Flight App Menu:");
            System.out.println("1. Create a new flight");
            System.out.println("2. Display all available flights");
            System.out.println("3. Create a passenger");
            System.out.println("4. Book a passenger onto a flight");
            System.out.println("5. Remove a passenger from a flight");
            System.out.println("6. Cancel a flight");
            System.out.println("7. Exit from app");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter Flight ID: ");
                    String flightID = scanner.nextLine();
                    System.out.println("Enter Destination: ");
                    String destination = scanner.nextLine();
                    Flight newflight = new Flight(flightID, destination);
                    app.addFlight(flightID, newflight);
                    System.out.println("Flight " + flightID + " to " + destination + " added successfully.");
                    break;
                case 2:
                    app.displayFlights();
                    break;
                case 3:
                    System.out.println("Enter Passenger ID: ");
                    String passengerID = scanner.nextLine();
                    System.out.println("Enter Passenger Name: ");
                    String passengerName = scanner.nextLine();
                    System.out.println("Enter Passenger Contact info: ");
                    String contactInfo = scanner.nextLine();
                    Passenger newPassenger = new Passenger(passengerID, passengerName, contactInfo);
                    System.out.println("Passenger " + passengerName + " created successfully.");
                    app.createPassenger(passengerID, newPassenger);
                    break;
                case 4:
                    System.out.println("Enter Flight ID to book passenger: ");
                    flightID = scanner.nextLine();
                    app.getFlight(flightID);
                    System.out.println("Enter PassengerID to book: ");
                    passengerID = scanner.nextLine();
                    app.addPassenger(flightID, passengerID);
                    System.out.println("PassengerID " + passengerID + " added to flightID " + flightID);
                    break;
                case 5:
                    System.out.println("Enter Flight ID to remove passenger: ");
                    flightID = scanner.nextLine();
                    app.getFlight(flightID);
                    System.out.println("Enter PassengerID to remove: ");
                    passengerID = scanner.nextLine();
                    app.removePassenger(flightID, passengerID);
                    System.out.println("PassengerID " + passengerID + " removed from flightID " + flightID);
                    break;
                case 6:
                    System.out.println("Enter Flight ID to cancel: ");
                    flightID = scanner.nextLine();
                    app.cancelFlight(flightID);
                    System.out.println("Flight " + flightID + " has been cancelled.");
                    break;
                case 7:
                    System.out.println("Exiting Flight App.");
                    System.exit(0);
                    break;
            }
        }
    }
}
