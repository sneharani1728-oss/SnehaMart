import java.util.Scanner;

public class main {
    static Scanner in = new Scanner(System.in);
    static UserData users = new UserData();
    static ProductData products = new ProductData();
    static OrderData orders = new OrderData();

    public static void main(String[] args) {
        seed();

        while (true) {
            System.out.println("\n=== SNEHAMART ===");
            System.out.println("1. Login\n2. Register\n3. View Dresses\n0. Exit");
            System.out.print("Choose: ");
            String choice = in.nextLine();

            if (choice.equals("0")) break;
            if (choice.equals("1")) {
                User user = Login.login(in, users);
                if (user != null) {
                    if (user.getRole() == User.Role.CUSTOMER)
                        CustomerDashboard.open(in, user, products, orders);
                    else if (user.getRole() == User.Role.SELLER)
                        SellerDashboard.open(in, user, products, orders);
                    else
                        OwnerDashboard.open(in, users, products, orders);
                }
            } else if (choice.equals("2")) {
                Register.register(in, users);
            } else if (choice.equals("3")) {
                ViewProducts.show(products.getAll());
            }
        }
        System.out.println("Thank you for choosing SnehaMart.");
    }

    static void seed() {
        users.add(new User("Sneha", "owner@snehamart.com", "admin123", User.Role.OWNER));
        users.add(new User("Aarohi Boutique", "seller@snehamart.com", "seller123", User.Role.SELLER));

        products.add(new Product("D101", "Rose Silk Anarkali", "Anarkali", 2499, 8,
                "Aarohi Boutique", "Elegant rose silk-blend festive dress"));
        products.add(new Product("D102", "Midnight Blue Gown", "Gown", 3299, 5,
                "Aarohi Boutique", "Luxury flowing evening gown"));
        products.add(new Product("D103", "Ivory Embroidered Kurti", "Kurti", 1899, 10,
                "Aarohi Boutique", "Soft ivory kurti with delicate embroidery"));
    }
}
