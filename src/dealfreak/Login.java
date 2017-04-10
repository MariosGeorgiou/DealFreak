package dealfreak;

import static dealfreak.DealFreak.clearScreen;

/**
 *
 * @author Ouranos
 */
public class Login {

    public static int count = 5;
    public static Customer[] c = new Customer[count];
    public static Customer customer = new Customer();

    Login() {
        //Access the login database
        c[0] = new Customer("Marios", "Hendon", "123", "marios@gmail.com", "123");
        c[1] = new Customer("Andreas", "Harrow", "456", "andreas@gmail.com", "123");
        c[2] = new Customer("Daniel", "London", "789", "daniel@gmail.com", "123");
        c[3] = new Customer("George", "York", "149", "george@gmail.com", "123");
        c[4] = new Customer("Simon", "Liverpool", "765", "simon@gmail.com", "123");

    }

    public boolean checkLogin(String email, String password) {
        for (int i = 0; i < count; i++) {
            if (email.equals(c[i].getEmail()) && password.equals(c[i].getPassword())) {
                clearScreen();
                System.out.print("**Success**\n");
                customer = c[i]; //successful login - select that customer
                System.out.print("Welcome back " + customer.getName());
                return true;
            }
        }
        return false;
    }

}
