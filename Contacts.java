package AddressBookUpdated;

import java.util.Scanner;

public class Contacts {
    Scanner sc = new Scanner(System.in);
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phone;
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
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
    public void editContact()
    {
        System.out.println("Enter first name");
        String firstName = sc.next();
        setFirstName(firstName);
        System.out.println("Enter last name");
        String lastName = sc.next();
        setLastName(lastName);
        System.out.println("Enter address");
        String address = sc.next();
        setAddress(address);
        System.out.println("Enter city");
        String city = sc.next();
        setCity(city);
        System.out.println("Enter state");
        String state = sc.next();
        setState(state);
        System.out.println("Enter zip");
        String zip = sc.next();
        setZip(zip);
        System.out.println("Enter phone");
        String phone = sc.next();
        setPhone(phone);
        System.out.println("Enter email");
        String email = sc.next();
        setEmail(email);

    }

    @Override
    public String toString() {
        return "Contacts{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


}


