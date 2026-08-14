import java.util.*;
import java.util.regex.Pattern;

public class LoginModule {

    // Stores email and password
    static Map<String, String> users = new HashMap<>();

    // Email validation
    static boolean isValidEmail(String email) {
        String emailPattern =
                "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        return Pattern.matches(emailPattern, email);
    }

    // Password validation
    // Minimum 8 characters,
    // at least one uppercase,
    // one lowercase,
    // one number
    static boolean isValidPassword(String password) {

        String passwordPattern =
                "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]).{8,}$";

        return Pattern.matches(passwordPattern, password);
    }

    // Register new user
    static boolean register(String email, String password) {

        // Check email
        if (!isValidEmail(email)) {
            System.out.println("Invalid email!");
            return false;
        }

        // Check password
        if (!isValidPassword(password)) {
            System.out.println(
                "Invalid password! Password must contain:"
                + "\n- At least 8 characters"
                + "\n- One uppercase letter"
                + "\n- One lowercase letter"
                + "\n- One number"
            );
            return false;
        }

        // Check existing user
        if (users.containsKey(email)) {
            System.out.println("User already exists!");
            return false;
        }

        // Save user
        users.put(email, password);

        System.out.println("Registration successful!");
        return true;
    }

    // Login
    static boolean login(String email, String password) {

        if (!users.containsKey(email)) {
            System.out.println("User not found!");
            return false;
        }

        if (!users.get(email).equals(password)) {
            System.out.println("Incorrect password!");
            return false;
        }

        System.out.println("Login successful!");
        System.out.println("Welcome to Savana!");
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== SAVANA LOGIN =====");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {

                System.out.print("Enter email: ");
                String email = sc.nextLine();

                System.out.print("Enter password: ");
                String password = sc.nextLine();

                register(email, password);

            } 
            else if (choice == 2) {

                System.out.print("Enter email: ");
                String email = sc.nextLine();

                System.out.print("Enter password: ");
                String password = sc.nextLine();

                login(email, password);

            } 
            else if (choice == 3) {

                System.out.println("Thank you for visiting SnehaMart!");
                break;

            } 
            else {

                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}
