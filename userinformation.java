import java.util.Scanner;

public class HeartRateApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt for personal information
        System.out.print("Enter first name: ");
        String firstName = input.nextLine();
        System.out.print("Enter last name: ");
        String lastName = input.nextLine();
        System.out.print("Enter birth month (1-12): ");
        int birthMonth = input.nextInt();
        System.out.print("Enter birth day: ");
        int birthDay = input.nextInt();
        System.out.print("Enter birth year: ");
        int birthYear = input.nextInt();

        // Create HeartRates object
        HeartRates person = new HeartRates(firstName, lastName, birthMonth, birthDay, birthYear);

        // Print person's information
        System.out.println("\nName: " + person.getFirstName() + " " + person.getLastName());
        System.out.println("Date of birth: " + person.getBirthMonth() + "/" + person.getBirthDay() + "/" + person.getBirthYear());
        System.out.println("Age: " + person.calculateAge() + " years");

        // Print heart rate calculations
        System.out.println("Maximum heart rate: " + person.calculateMaxHeartRate() + " beats per minute");
        System.out.println("Target heart rate range: " + person.calculateTargetHeartRate() + " beats per minute");
    }
}