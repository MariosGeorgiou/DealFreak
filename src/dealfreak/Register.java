
package dealfreak;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Ouranos
 */
public class Register {
    
    
    Customer cus = new Customer();
    
    Register(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        cus.setName(sc.nextLine());
        
        System.out.print("Enter your address: ");
        cus.setAddress(sc.nextLine());
        
        System.out.print("Enter your phone: ");
        cus.setPhone(sc.nextLine());
        
        System.out.println();
        System.out.println("---Set login details---");
        
        System.out.print("Enter your email: ");
        cus.setEmail(sc.nextLine());
        
        System.out.print("Set a password: ");
        cus.setPassword(sc.nextLine());
        
        cus.setBusinessAccount(false);
        
        BufferedWriter db = null;
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
        }
    }
    
    
}
