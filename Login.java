import java.util.Scanner;

class Login {

    static Scanner sc = new Scanner(System.in);

    static boolean login() {

        String correctUsername = "Sneha";
        String correctPassword = "1728";

        System.out.println("\n========== SNEHAHUB LOGIN ==========");

        for (int attempt = 1; attempt <= 3; attempt++) {

            System.out.print("Enter Username: ");
            String username = sc.nextLine();

            System.out.print("Enter Password: ");
            String password = sc.nextLine();

            if (username.equals(correctUsername)
                    && password.equals(correctPassword)) {

                System.out.println("Login Successful!");
                return true;

            } else {
                System.out.println("Invalid Username or Password!");
                System.out.println("Attempts remaining: " + (3 - attempt));
            }
        }

        System.out.println("Account locked. Too many failed attempts.");
        return false;
    }

    public static void main(String[] args) {

        if (login()) {
            System.out.println("Welcome to SNEHA HUB!");
        } else {
            System.out.println("Please try again later.");
        }
    }
}
