
package dealfreak;

/**
 *
 * @author Ouranos
 */
public final class Business {
    private String name;
    private String address;
    private String companyRegNumber;
    private String SICnumber;
    private String phone;
    private String website;
    Customer owner;
    
    Business(){
        
    }
    
    Business(String name, String address, String companyRegNumber, 
            String SICnumber, String phone, String website, Customer cus){
        
        setName(name);
        setAddress(address);
        setCompanyRegNumber(companyRegNumber);
        setSICnumber(SICnumber);
        setPhone(phone);
        setWebsite(website);
        setOwner(cus);
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

    public String getCompanyRegNumber() {
        return companyRegNumber;
    }

    public void setCompanyRegNumber(String companyRegNumber) {
        this.companyRegNumber = companyRegNumber;
    }

    public String getSICnumber() {
        return SICnumber;
    }

    public void setSICnumber(String SICnumber) {
        this.SICnumber = SICnumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Customer getOwner() {
        return owner;
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }
    
    
}
