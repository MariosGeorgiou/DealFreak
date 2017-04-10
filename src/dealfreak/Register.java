package dealfreak;

/*import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;*/
import java.util.Scanner;

/**
 *
 * @author Ouranos
 */
public final class Register {

    private String name;
    private String address;
    private String phone;
    private String email;
    private String password;
    Customer cus = new Customer();

    //Constructor for given information
    public Register(String name, String address, String phone, String email, String password) throws Exception {
        EmailValidator ev = new EmailValidator();
        if (ev.checkEmail(email)) {
            setName(name);
            setAddress(address);
            setPhone(phone);
            setEmail(email);
            setPassword(password);
            completeRegistration();
        } else {
            System.out.println("!!!The registration was unsuccessful. Check email and try again!!!");
        }
    }

    //empty constructor
    //It uses command line interaction to collect the information from the user
    Register() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        setName(sc.nextLine());

        System.out.print("Enter your address: ");
        setAddress(sc.nextLine());

        System.out.print("Enter your phone: ");
        setPhone(sc.nextLine());

        System.out.println();
        System.out.println("---Set login details---");

        System.out.print("Enter your email: ");
        String em = sc.nextLine();
        while (true) {
            try {
                EmailValidator ev = new EmailValidator();
                if (ev.checkEmail(em)) {
                    setEmail(em);
                    break;
                }
                else{
                    System.out.print("!!Wrong Email!!\nEnter a valid email: ");
                    em = sc.nextLine();
                }
            } catch (Exception e) {
                
            }
        }
        System.out.print("Set a password: ");
        setPassword(sc.nextLine());

        completeRegistration();
        //Uses a text file as a dummy database 
        /*BufferedWriter db = null;
        try {
        FileWriter database = new FileWriter("database.txt", true);
        db = new BufferedWriter(database);
        db.write(cus.getName()+"?");
        db.write(cus.getAddress()+"?");
        db.write(cus.getPhone()+"?");
        db.write(cus.getEmail()+"?");
        db.write(cus.getPassword()+"?");
        db.write("false?");
        db.write("!!!\n");
        db.close();
        } catch (IOException ex) {
        System.err.println("Error: " + ex.getMessage());
        }*/
    }

    public Customer getCustomer() {
        return cus;
    }

    public void completeRegistration() {
        cus.setName(getName());
        cus.setAddress(getAddress());
        cus.setPhone(getPhone());
        cus.setEmail(getEmail());
        cus.setPassword(getPassword());
        cus.setBusinessAccount(false);
        //by deafault the customer is not linked to business options
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
