import java.util.*;

class Login {

    static Scanner sc = new Scanner(System.in);

    // Stores username and password
    static HashMap<String, String> users = new HashMap<>();

    static void register() {

        System.out.println("\n========== SNEHAMART USER REGISTRATION ==========");

        System.out.print("Enter New Username: ");
        String username = sc.nextLine();

        if (users.containsKey(username)) {
            System.out.println("Username already exists!");
            return;
        }

        System.out.print("Enter New Password: ");
        String password = sc.nextLine();

        users.put(username, password);

        System.out.println("Registration Successful!");
        System.out.println("You can now login.");
    }

    static boolean login() {

        System.out.println("\n========== SNEHAMART USER LOGIN ==========");

        for (int attempt = 1; attempt <= 3; attempt++) {

            System.out.print("Enter Username: ");
            String username = sc.nextLine();

            System.out.print("Enter Password: ");
            String password = sc.nextLine();

            if (users.containsKey(username)
                    && users.get(username).equals(password)) {

                System.out.println("Login Successful!");
                System.out.println("Welcome to SnehaMart, " + username + "!");
                return true;

            } else {
                System.out.println("Invalid Username or Password!");
                System.out.println("Attempts remaining: " + (3 - attempt));
            }
        }

        System.out.println("Account locked. Too many failed attempts.");
        return false;
    }

    static boolean sellerLogin() {

        String correctUsername = "Seller";
        String correctPassword = "5678";

        System.out.println("\n========== SNEHAMART SELLER LOGIN ==========");

        for (int attempt = 1; attempt <= 3; attempt++) {

            System.out.print("Enter Username: ");
            String username = sc.nextLine();

            System.out.print("Enter Password: ");
            String password = sc.nextLine();

            if (username.equals(correctUsername)
                    && password.equals(correctPassword)) {

                System.out.println("Seller Login Successful!");
                System.out.println("Welcome to SnehaMart Seller!");
                return true;

            } else {
                System.out.println("Invalid Username or Password!");
                System.out.println("Attempts remaining: " + (3 - attempt));
            }
        }

        System.out.println("Seller account locked.");
        return false;
    }

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n========== SNEHAMART ==========");
            System.out.println("1. New User Registration");
            System.out.println("2. User Login");
            System.out.println("3. Seller Login");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {

                register();

            } else if (choice == 2) {

                login();

            } else if (choice == 3) {

                sellerLogin();

            } else if (choice == 4) {

                System.out.println("Thank you for visiting SnehaMart!");
                break;

            } else {

                System.out.println("Invalid choice!");
            }
        }
    }
}
