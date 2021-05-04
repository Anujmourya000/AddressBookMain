public class AddressBookMain {

    private String firstname;
    private String lastname;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String email;

    public AddressBookMain(String firstname, String lastname, String address, String city, String state, String zip, String email){
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.email = email;
    }

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
        System.out.println("Welcome to Address Book Program");
        AddressBookMain Contacts = new AddressBookMain("Anuj", "Mourya", "Yugantar colony", "Bhopal",
                                                        "M.P.", "462022", "akm123@gmail.com");
        System.out.println("Contact Details are: "+Contacts);
    }
}
