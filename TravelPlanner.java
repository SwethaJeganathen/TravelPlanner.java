import java.util.ArrayList;
import java.util.Scanner;

class TravelItinerary {
    String destination;
    String startDate;
    String endDate;
    double budget;

    // Constructor
    public TravelItinerary(String destination, String startDate, String endDate, double budget) {
        this.destination = destination;
        this.startDate = startDate;
        this.endDate = endDate;
        this.budget = budget;
    }

    // Display Itinerary
    public void displayItinerary() {
        System.out.println("\n--- Travel Itinerary ---");
        System.out.println("Destination : " + destination);
        System.out.println("Start Date  : " + startDate);
        System.out.println("End Date    : " + endDate);
        System.out.printf("Budget      : $%.2f\n", budget);
    }
}

public class TravelPlanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<TravelItinerary> itineraries = new ArrayList<>();

        System.out.println("Welcome to the Travel Itinerary Planner!\n");

        // Collect travel details
        System.out.print("How many travel plans do you want to create? ");
        int numPlans = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < numPlans; i++) {
            System.out.println("\nEnter details for Travel Plan " + (i + 1) + ":");

            System.out.print("Destination: ");
            String destination = scanner.nextLine();

            System.out.print("Start Date (YYYY-MM-DD): ");
            String startDate = scanner.nextLine();

            System.out.print("End Date (YYYY-MM-DD): ");
            String endDate = scanner.nextLine();

            System.out.print("Estimated Budget: ");
            double budget = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            // Create and store the itinerary
            itineraries.add(new TravelItinerary(destination, startDate, endDate, budget));
        }

        // Display all itineraries
        System.out.println("\n--- Your Travel Plans ---");
        for (TravelItinerary itinerary : itineraries) {
            itinerary.displayItinerary();
        }

        scanner.close();
    }
}
