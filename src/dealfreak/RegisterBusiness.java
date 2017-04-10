package dealfreak;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Ouranos
 */
public final class RegisterBusiness {

    private String name;
    private String address;
    private String companyRegNumber;
    private String SICnumber;
    private String phone;
    private String website;
    Customer owner;
    Business bus = new Business();

    AutoCheckBusiness instance = new AutoCheckBusiness();

    //Constructor for given information
    RegisterBusiness(String name, String address, String companyRegNumber,
            String SICnumber, String phone, String website, Customer cus) {

        setName(name);
        setAddress(address);
        setCompanyRegNumber(companyRegNumber);
        setSICnumber(SICnumber);
        setPhone(phone);
        setWebsite(website);
        setOwner(cus);

        //If all the checks pass, complete Registartion
        completeRegistration();
    }

    //empty constructor
    //It uses command line interaction to collect the information from the user
    RegisterBusiness(Customer cus) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter business name: ");
        setName(sc.nextLine());

        System.out.print("Enter business address: ");
        setAddress(sc.nextLine());

        System.out.print("Enter company number: ");
        String s = sc.nextLine();
        if (instance.checkAuto(s)) {
            setCompanyRegNumber(s);
            System.out.print("Enter SIC address: ");
            setSICnumber(sc.nextLine());

            System.out.print("Enter business phone: ");
            setPhone(sc.nextLine());

            System.out.print("Enter business website: ");
            setWebsite(sc.nextLine());

            setOwner(cus);

            completeRegistration();
            System.out.println("***Registartion Successful***\n");
        } else {
            System.out.println("!!Incorrect company registartion number!!");
            System.out.println("***Registartion cancelled**");
        }

    }

    public void completeRegistration() {
        bus.setName(getName());
        bus.setAddress(getAddress());
        bus.setCompanyRegNumber(getCompanyRegNumber());
        bus.setSICnumber(getSICnumber());
        bus.setPhone(getPhone());
        bus.setWebsite(getWebsite());
        //by deafault the customer is now the business owner
        bus.setOwner(getOwner());
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
