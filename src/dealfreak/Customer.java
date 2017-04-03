
package dealfreak;

/**
 *
 * @author Ouranos
 */
public class Customer {
    
    private String name;
    private String address;
    private String phone;
    private String email;
    private String password;
    private boolean businessAccount;
    
    Customer(){
        //empty constructor
    }
    
    
    Customer(String name, String address, String phone, String email, String password){
        setName(name);
        setAddress(address);
        setPhone(phone);
        setEmail(email);
        setPassword(password);
        setBusinessAccount(false); //default - no business account
    }
    
    
    //set Name
    public void setName(String name){
        this.name = name;
    }
    
    //get Name
    public String getName() {
       return name;
    }
    
    //set address
    public void setAddress(String address){
        this.address = address;
    }
    
    //get address
    public String getAddress() {
       return address;
    }
    
    //set phone
    public void setPhone(String phone){
        this.phone = phone;
    }
    
    //get phone
    public String getPhone() {
       return phone;
    }
    
    //set email
    public void setEmail(String email){
        this.email = email;
    }
    
    //get email
    public String getEmail() {
       return email;
    }
    
    //set password
    public void setPassword(String password){
        this.password = password;
    }
    
    //get password
    public String getPassword() {
       return password;
    }
    
    //set BusinessAccount
    public void setBusinessAccount(boolean businessAccount){
        this.businessAccount = businessAccount;
    }
    
    //get password
    public boolean getBusinessAccount() {
       return businessAccount;
    }
}
