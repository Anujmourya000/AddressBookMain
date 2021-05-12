import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @description Created class for Address Book Main
 * @param
 *
 */
public class AddressBookMain {
	private static LinkedList<String> details = new LinkedList<>();

	/**
	 * @description Created method as AddressBook where we can call other method
	 *              inside it
	 * @param
	 *
	 */
	public static void AddressBook() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER OPTIONS");
		System.out.println("1. Add Record");
		System.out.println("2. Delete Record");
		System.out.println("3. edit Record");
		System.out.println("4. Exit");
		String options = sc.nextLine();

		if (options.equals(1)) {
			addRecord();
		} else if (options.equals(2)) {
			deleteRecord();
		} else if (options.equals(3)) {
			editRecord();
		}
	}

	/**
	 * @description Add record method where details are being added
	 * @param
	 *
	 */
	private static void addRecord() {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the details: ");

		System.out.println("Enter the firstname: ");
		String firstname = sc1.nextLine();
		details.add(firstname);
		System.out.println("Firstname: " + firstname);

		System.out.println("Enter the Lastname: ");
		String lastname = sc1.nextLine();
		details.add(lastname);
		System.out.println("Lastname: " + lastname);

		System.out.println("Enter the address: ");
		String address = sc1.nextLine();
		details.add(address);
		System.out.println("address: " + address);

		System.out.println("Enter the State: ");
		String state = sc1.nextLine();
		details.add(state);
		System.out.println("state: " + state);

		System.out.println("Enter the City: ");
		String city = sc1.nextLine();
		details.add(city);
		System.out.println("City: " + city);

		System.out.println("Enter the Zip: ");
		String zip = sc1.nextLine();
		details.add(zip);
		System.out.println("Zip: " + zip);

		System.out.println("Enter the Phone: ");
		String phone = sc1.nextLine();
		details.add(phone);
		System.out.println("Phone: " + phone);

		System.out.println("All details are: " + details);

	}

	/**
	 * @description Delete method where we can delete the records
	 * @param
	 *
	 */
	private static void deleteRecord() {
		Scanner sc3 = new Scanner(System.in);
		System.out.println("By using name we can delete person detail press 1 for firstname or press 2 for lastname");
		int pressed = sc3.nextInt();
		if (pressed == 1) {
			System.out.println("Enter the name you want to delete ");
			String firstname = sc3.nextLine();
			details.contains(sc3.nextLine());
			details.removeAll(details);
			System.out.println(firstname + " details deleted: " + details);
		} else if (pressed == 2) {
			System.out.println("Enter the name you want to delete ");
			String lastname = sc3.nextLine();
			details.contains(sc3.nextLine());
			details.removeAll(details);
			System.out.println(lastname + " details deleted: " + details);
		}
	}

	/**
	 * @description Edit method where we can edit the records
	 * @param
	 *
	 */
	private static void editRecord() {
		Scanner sc2 = new Scanner(System.in);
		System.out.println("what you want to edit press 1 for firstname or press 2 for lastname");
		int pressed = sc2.nextInt();
		if (pressed == 1) {
			System.out.println("Enter the first name: ");
			String firstname = sc2.nextLine();
			details.set(0, (sc2.nextLine()));
			System.out.println("Updated firstname");
			System.out.println("Updated details: " + details);
		} else if (pressed == 2) {
			System.out.println("Enter the Last name: ");
			String lastname = sc2.nextLine();
			details.set(1, (sc2.nextLine()));
			System.out.println("Updated lastname");
			System.out.println("Updated details: " + details);
		}
	}

	/**
	 * @description method for taking entry of multiple person
	 * @param
	 *
	 */
	public static void multiplePerson() {
		Scanner sc4 = new Scanner(System.in);
		System.out.println("Enter the number of person you want to add: ");
		int person = sc4.nextInt();
		for (int i = 0; i < person; i++) {
			addRecord();
		}
	}

	/**
	 * @description Main method
	 * @param
	 *
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		AddressBook();
		multiplePerson();
	}
}