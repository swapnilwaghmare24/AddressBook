package AddressBookUpdated;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

    Scanner sc = new Scanner(System.in);
    List<Contacts> lc = new ArrayList<Contacts>();


   void getContact() {
        AddressBook ab = new AddressBook();
        Contacts c = new Contacts();
        System.out.println("Enter first name");
        String firstName = sc.next();
        c.setFirstName(firstName);
        System.out.println("Enter last name");
        String lastName = sc.next();
        c.setLastName(lastName);
        System.out.println("Enter address");
        String address = sc.next();
        c.setAddress(address);
        System.out.println("Enter city");
        String city = sc.next();
        c.setCity(city);
        System.out.println("Enter state");
        String state = sc.next();
        c.setState(state);
        System.out.println("Enter zip");
        String zip = sc.next();
        c.setZip(zip);
        System.out.println("Enter phone");
        String phone = sc.next();
        c.setPhone(phone);
        System.out.println("Enter email");
        String email = sc.next();
        c.setEmail(email);
        //System.out.println(c);
        lc.add(c);
    }
}






