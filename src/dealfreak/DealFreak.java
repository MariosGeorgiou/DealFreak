package dealfreak;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author Ouranos
 */
public class DealFreak {

    private static String l1;
    public static int count = 5;
    public static Customer[] c = new Customer[count];
    public static Customer customer = new Customer();

    public static void main(String[] args) throws IOException {
        /*for(int i=0; i<count; i++){
        printCustomer(c[i]);
        System.out.println();
        }*/
        Scanner sc = new Scanner(System.in);
                
        //Initial interaction -> Register or Login
        while(true){
            loginOrRegister();
            l1 = sc.nextLine();
            if(("1".equals(l1) || "0".equals(l1))){  
                break;
            }
            System.out.println("**** Wrong Input - Try again *****");  //wrong input
        }
        clearScreen();
        
        
        //If Login selected
        if("1".equals(l1)){
            boolean escape = true;
            Login login = new Login();
            while(escape){
                System.out.println("---Login---");
                System.out.print("Email: ");
                String e = sc.nextLine();
                System.out.print("Password: ");
                String p = sc.nextLine();
                if (login.checkLogin(e, p)){
                    escape =false;
                }
                else{
                    System.out.print("Incorrect email or password, try again!\n");
                }
                
            }
            
        }
        //If Register selected
        else if ("0".equals(l1)){
            System.out.println("---Register---");
            Register r = new Register();
            clearScreen();
            System.out.println("***Registartion Successful***\n");
            customer = r.cus;
            System.out.println("Welcome to DealDreak " + customer.getName());
        }
         
         
        boolean correctSelection = true;
        boolean enabledBusinessOptions = false;
        CustomerOptions coptions = new CustomerOptions();
        BusinessOptions boptions = new BusinessOptions();
        //Menu Options
        while (true) {
            int count = 0;
            System.out.println("---Customer options---");
            //CustomerOptions coptions = new CustomerOptions();
            for (String option : coptions.getOptions()) {
                System.out.println(">>" + count + " " + option);
                count++;
            }
            int countb = count;
            System.out.println("\n---Business options---");
            //BusinessOptions boptions = new BusinessOptions();
            for (String option : boptions.getOptions()) {
                System.out.println(">>" + countb + " " + option);
                countb++;
            }

            //prompt the user for selection
            int m = -1; //default intiliazation (not a correct option)
            try {
                m = sc.nextInt();
            } catch (Exception x) {
                System.err.println(x);
                correctSelection = false;
            }

            //If the input is not integer
            //Skip this and try again
            if (correctSelection) {
                //Correct selection actions
                if (m >= 0 && m <= count - 1) {
                    //if(m==count)
                    break;
                } else if (m >= count && m < countb && !enabledBusinessOptions) {
                    //the options can enable only once
                    if (boptions.enable(customer.getBusinessAccount())) {
                        enabledBusinessOptions = true;
                        customer.setBusinessAccount(true);

                        clearScreen();
                        System.out.println("******************************");
                        System.out.println("*Business options now enabled*");
                        System.out.println("******************************");
                    }
                } else if (m >= count && m < countb) {
                    if (m == count){
                        System.out.print("Are you sure? (1 for yes or  0 for no): ");
                        int choice = sc.nextInt();
                        System.out.print(choice);
                        if (choice == 1){
                            System.out.println("---Business Registration---");
                            RegisterBusiness bu = new RegisterBusiness(customer);
                            clearScreen();
                            
                        }
                        else{
                            clearScreen();
                            System.out.println("%%%%%% No problem! %%%%%%");
                        }
                    }
                    break;
                } else {
                    //If the input is an int but not in the options
                    clearScreen();
                    System.out.println("!!!Incorrect selection-Try again!!!");
                }
            }
            correctSelection = true;
        }

    }

    public static void loginOrRegister() {
        clearScreen();
        System.out.println("$$$ DEAL FREAK $$$");
        System.out.println("To access the system enter 0 to Register or 1 to Login ");
        System.out.println(">>0 Register");
        System.out.println(">>1 Login");

    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void printCustomer(Customer cust) {
        System.out.print(" " + cust.getName());
        System.out.print(" " + cust.getAddress());
        System.out.print(" " + cust.getPhone());
        System.out.print(" " + cust.getEmail());
        System.out.print(" " + cust.getPassword());
        System.out.print(" " + cust.getBusinessAccount());
    }

}
