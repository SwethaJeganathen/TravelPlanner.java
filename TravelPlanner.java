import java.util.Scanner;

public class TravelPlanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Welcome message
        System.out.println("Welcome to the Travel Planner!\n");

        // Get travel details from the user
        System.out.print("Enter your destination: ");
        String destination = scanner.nextLine();

        System.out.print("Enter your travel dates (e.g., 2024-12-25): ");
        String travelDate = scanner.nextLine();

        System.out.print("Enter your budget for the trip: ");
        double budget = scanner.nextDouble();
        scanner.nextLine();  // Consume newline left by nextDouble()

        System.out.print("Enter your preferences (e.g., adventurous, relaxing): ");
        String preferences = scanner.nextLine();

        // Generate the travel plan
        System.out.println("\nTravel Plan for Your Trip to " + destination + ":\n");
        System.out.println("Destination: " + destination);
        System.out.println("Travel Dates: " + travelDate);
        System.out.println("Budget: " + budget);
        System.out.println("Preferences: " + preferences);

        // Display estimated weather and activities (simplified)
        System.out.println("\nEstimated Weather: 15°C (Partly Cloudy)");
        System.out.println("Activities: Visit museums, enjoy local cuisine, and relax at parks.");

        System.out.println("\nEnjoy your trip! Safe travels!");
        System.out.println("\nThank you for using the Travel Itinerary Planner!\n");

        scanner.close();
    }
}

  
