import java.util.*;

public class AddressBookMain
{
    public static void main(String[] args)
    {
        ArrayList<Contact> contactList=new ArrayList<Contact>();

        Contact contact1=new Contact("Omkeshwari","Pilare","Matunga","Mumbai","Maharashtra","400022","987654321","omp@gmail.com");
        contactList.add(contact1);
        Contact contact2=new Contact("Madhuri","Pilare","Vashi","Mumbai","Maharashtra","400044","9878761234","madz@gmail.com");
        contactList.add(contact2);
        
        for(Contact lobj:contactList)
        {    
            System.out.println("Fisrt Name: "+lobj.getFirstName());
            System.out.println("Last Name: "+lobj.getLastName());
            System.out.println("Address: "+lobj.getAddress());
            System.out.println("City: "+lobj.getCity());
            System.out.println("State: "+lobj.getState());
            System.out.println("Zip: "+lobj.getZip());
            System.out.println("Phone Number: "+lobj.getPhoneNumber());
            System.out.println("Email: "+lobj.getEmail());
            System.out.println("--------------------------------");
        }
    }
}