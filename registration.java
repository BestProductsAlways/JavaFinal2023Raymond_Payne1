import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RegistrationSystem {
    private static Set<String> registeredEmails = new HashSet<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Register\n2. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    registerUser(scanner);
                    break;
                case 2:
                    System.out.println("Exiting the registration system. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void registerUser(Scanner scanner) {
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        if (isValidEmail(email)) {
            if (!registeredEmails.contains(email)) {
                registeredEmails.add(email);
                System.out.println("Registration successful!");
            } else {
                System.out.println("Email already registered. Please use a different email.");
            }
        } else {
            System.out.println("Invalid email format. Please enter a valid email.");
        }
    }

    private static boolean isValidEmail(String email) {
        // Basic email validation, you can replace this with a more sophisticated validation
        return email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
    }
}
