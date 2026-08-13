import java.util.*;

public class Login {
    static Map<String, String> users = new HashMap<>();

    public static void main(String[] args) {
        // pre-added users (email -> password)
        users.put("admin@shop.com", "admin123");
        users.put("sneha@shop.com", "sneha123");

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Shopping Website Login =====");
        System.out.print("Enter email: ");
        String email = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (users.containsKey(email) && users.get(email).equals(password)) {
            System.out.println("Login successful! Welcome, " + email);
        } else {
            System.out.println("Invalid email or password.");
        }

        sc.close();
    }
}
