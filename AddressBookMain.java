import java.util.Scanner;
public class AddressBookMain {
    private String firstname;
    private String lastname;
    private String address;
    private String city;
    private String state;
    private int zip;
    private String email;
    /**
     *  @description Constructor for AddressBookMain Class
     *  @param
     *
     */
    public AddressBookMain(String firstname, String lastname, String address, String city, String state, int zip, String email){
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.email = email;
    }
    /**
     *  @description Overriding toString Method to print the values of Heap memory instead of address
     *  @param
     *
     */
    @Override
    public String toString() {
        return "AddressBookMain{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Address Book Program");
        AddressBookMain Contact1 = new AddressBookMain("Anuj", "Mourya", "Yugantar colony", "Bhopal",
                                                        "M.P.", 462022, "akm123@gmail.com");
        System.out.println("Contact1 Details are: "+Contact1);
        System.out.println("please enter the contact details as:\n firstname\n lastname\n address\n city\n state\n zip\n email\n");
        AddressBookMain Contact2 = new AddressBookMain(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(),
                                                        sc.nextLine(), sc.nextInt(), sc.nextLine());

        System.out.println("Contact2 Details are: "+Contact2);
    }
}
