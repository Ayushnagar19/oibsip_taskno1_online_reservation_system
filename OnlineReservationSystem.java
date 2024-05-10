import java.util.Scanner;

class User {
    private String loginId;
    private String password;

    public User(String loginId, String password) {
        this.loginId = loginId;
        this.password = password;
    }

    public boolean authenticate(String loginId, String password) {
        return this.loginId.equals(loginId) && this.password.equals(password);
    }
}

class Reservation {
    private String name;
    private String trainNumber;
    private String classType;
    private String dateOfJourney;
    private String from;
    private String to;

    public Reservation(String name, String trainNumber, String classType, String dateOfJourney, String from, String to) {
        this.name = name;
        this.trainNumber = trainNumber;
        this.classType = classType;
        this.dateOfJourney = dateOfJourney;
        this.from = from;
        this.to = to;
    }

    public void insertReservation() {
        System.out.println("Reservation inserted successfully.");
    }
}

class Cancellation {
    private String pnrNumber;

    public Cancellation(String pnrNumber) {
        this.pnrNumber = pnrNumber;
    }

    public void cancelTicket() {
        System.out.println("Ticket cancelled successfully.");
    }
}

public class OnlineReservationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Login Form");
        System.out.print("Enter login id: ");
        String loginId = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        User user = new User("ayush_nagar", "ayush3231");
        if (user.authenticate(loginId, password)) {
            System.out.println("Login successful.");
        } else {
            System.out.println("Invalid login credentials. Exiting...");
            System.exit(0);
        }

        System.out.println("\nReservation System");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter train number: ");
        String trainNumber = scanner.nextLine();
        String trainName = "Sample Train";
        System.out.println("Train Name: " + trainName);
        System.out.print("Enter class type: ");
        String classType = scanner.nextLine();
        System.out.print("Enter date of journey: ");
        String dateOfJourney = scanner.nextLine();
        System.out.print("Enter from (place): ");
        String from = scanner.nextLine();
        System.out.print("Enter to (destination): ");
        String to = scanner.nextLine();

        Reservation reservation = new Reservation(name, trainNumber, classType, dateOfJourney, from, to);
        reservation.insertReservation();

        System.out.println("\nCancellation Form");
        System.out.print("Enter PNR number to cancel ticket: ");
        String pnrNumber = scanner.nextLine();

        Cancellation cancellation = new Cancellation(pnrNumber);
        cancellation.cancelTicket();

        scanner.close();
    }
}