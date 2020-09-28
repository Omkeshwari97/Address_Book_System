import java.util.*;

public class AddressBookMain
{
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;
    private String email;

    public AddressBookMain(String firstName,String lastName,String address,String city,String state,String zip,String phoneNumber,String email)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.address=address;
        this.city=city;
        this.state=state;
        this.zip=zip;
        this.phoneNumber=phoneNumber;
        this.email=email;
    }

    public static void main(String[] args)
    {
        AddressBookMain contact1=new AddressBookMain("Omkeshwari","Pilare","Matunga","Mumbai","Maharashtra","400022","987654321","omp@gmail.com");
    }
}