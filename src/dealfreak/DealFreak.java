
package dealfreak;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author Ouranos
 */
public class DealFreak {

    private static String l1;
    public static int count = 5;
    //create some customers
    public static Customer[] c = new Customer[count];
    public static Customer customer = new Customer();

    
    public static void main(String[] args) throws IOException, NullPointerException{
        c[0] = new Customer("Marios", "Hendon", "123", "marios@gmail.com", "123");
        c[1] = new Customer("Andreas", "Harrow", "456", "andreas@gmail.com", "123");
        c[2] = new Customer("Daniel", "London", "789", "daniel@gmail.com", "123");
        c[3] = new Customer("George", "York", "149", "george@gmail.com", "123");
        c[4] = new Customer("Simon", "Liverpool", "765", "simon@gmail.com", "123");
        
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
        
        
        //Login
        if("1".equals(l1)){
            boolean escape = true;
            while(escape){
               System.out.println("---Login---");
                System.out.print("Email: ");
                String e = sc.nextLine();
                System.out.print("Password: ");
                String p = sc.nextLine();
                for(int i=0; i<count; i++){
                    if (e.equals(c[i].getEmail()) && p.equals(c[i].getPassword())){
                       clearScreen();
                       System.out.print("**Success**\n");
                       customer = c[i]; //successful login - select that customer
                       System.out.print("Welcome back "+ customer.getName());
                       escape = false;
                   }
                }
                if(escape){
                    System.out.print("Incorrect email or password, try again!\n");
                }
                
            }
            
        }
        //Register
        else if ("0".equals(l1)){
            System.out.println("---Register---");
            Register r = new Register();
            clearScreen();
            System.out.println("***Registartion Successful***\n");
            customer = r.cus;
            System.out.println("Welcome to DealDreak " + customer.getName());
        }

        
        //Menu Options
        
    }
    
    public static void loginOrRegister(){
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
    
    public static void printCustomer(Customer cust){
        System.out.print(" "+cust.getName());
        System.out.print(" "+cust.getAddress());
        System.out.print(" "+cust.getPhone());
        System.out.print(" "+cust.getEmail());
        System.out.print(" "+cust.getPassword());
    }
    
}
