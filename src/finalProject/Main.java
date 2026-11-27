package finalProject;

import java.util.*;

public class Main {
	public static final Scanner input = new Scanner(System.in);
	public static final LinkedList<User> users = new LinkedList<>();
	public static final String PROVINCE = Iloilo;
// FUCK!!
	public static void main(String[] args) {
		boolean running = true;

		while(running) {
			try {
				displayMenu();
				System.out.print("Choose an option: ");
				switch(input.nextInt()) {
				case 1 -> manageUsers(); // FINISHED
				case 2 -> showBillingMenu(); // IN PROGRESS
				case 3 -> showPlans(); // NOT STARTED
				case 4 -> showSubscription(); // NOT STARTED
				case 5 -> showAnnualRevenue(); // NOT STARTED
				case 0 -> running = false;
				default -> System.out.println("Invalid choice, try again!");
				}

			} catch (Exception e) {
				System.out.println("Invalid input, try again!");
				input.nextLine();
			}
		}
	}				

	public static void displayMenu() {
		System.out.println();
		System.out.println("1. User Management");
		System.out.println("2. Billing Options");
		System.out.println("3. View plans and rate"); 
		System.out.println("4. View User Subscription and Benefits");
		System.out.println("5. View Annual Service Revenue");
		System.out.println("0. Exit");
	}
	// Manage user part (1)
	public static void manageUsers() {
		System.out.println("\n=== User Management ===");
		System.out.println("1. Add new user");
		System.out.println("2. List users");
		System.out.println("3. Fetch user info");
		System.out.println("4. Delete existing user");
		System.out.println("5. Back to main menu");
		System.out.print("Select choice: ");


		switch(input.nextInt()) {
		case 1:
			createUser();
			break;
		case 2:
			displayUsers();
			break;
		case 3:
			displayUserDetails();
			break;
		case 4:
			deleteUser();
			break;
		case 5:
			return;
		default:
			System.out.println("Invalid choice, try again!");
		}
	}

	public static void createUser() {
		input.nextLine();
		System.out.println("Add user:");

		System.out.println("1. Premium");
		System.out.println("2. Regular");
		System.out.print("Select user type: ");
		String userType = input.nextLine();

		System.out.print("First name: ");
		String firstName = input.nextLine();

		System.out.print("Last name: ");
		String lastName = input.nextLine();

		System.out.println("=-=-= Address =-=-=");

		System.out.print("Barangay: ");
		String barangay = input.nextLine();

		System.out.print("Town: ");
		String town = input.nextLine();

		String userID = "USER" + generateID();

		System.out.println("Subscription Name: ");
		String subscriptionName = input.nextLine();


		switch(input.nextInt()) {
			case 1-> users.add(new PremiumUser(firstName, lastName, userID, barangay + town)); 	
			case 2 -> users.add(new RegularUser(firstName, lastName, userID, barangay + town));
			default -> System.out.println("Invalid choice, try again.");
		}

		System.out.println("Successfully added: ");
		System.out.println("Name: " + firstName + " " + lastName);
		System.out.println("User ID: " + userID);
		System.out.println("Address: " + barangay + " " + town);
	}

	public static void displayUsers() {

		if (users.isEmpty()) {
			System.out.println("User is empty, please add a user.");
			manageUsers();
		} else {
			System.out.println("=-=-= Users List =-=-=");

			int counter = 1;

			for (User user : users) {
				System.out.println(counter + ". " + user.getUserID());
				counter++;
			}
			System.out.println("Press enter to return to the menu.");
			input.nextLine();
			input.nextLine();
			manageUsers();
		}
	}

	public static void displayUserDetails() {
		input.nextLine();
		System.out.print("Enter User ID (type cancel to return): ");
		String userID = input.nextLine();

		if (userID.equalsIgnoreCase("cancel")) {
			return;
		} else {
			for (User user : users) {
				if (user.getUserID().equalsIgnoreCase(userID)) {
					user.displayInfo();
					return;
				}
			}

			System.out.println("User not found.");
		}
	}

	public static void deleteUser() {
		input.nextLine();
		System.out.println("Enter User ID to delete (type cancel to return):");
		String userID = input.nextLine();

		if (userID.equalsIgnoreCase("cancel")) {
			return;
		}

		Iterator<User> iterator = users.iterator();

		while (iterator.hasNext()) {
			User user = iterator.next();

			if (user.getUserID().equalsIgnoreCase(userID)) {
				System.out.print("Are you sure you want to delete " + user.getFullName() + " (" + user.getUserID() + ")" + "? (Y/N): ");
				String confirm = input.nextLine();

				if (confirm.equalsIgnoreCase("Y")) {
					iterator.remove();
					System.out.println("User successfully deleted.");
				} else {
					System.out.println("Deletion cancelled.");
				}

				return;
			}
		}

		System.out.println("User not found.");
	}

	// billing options
	private static void showBillingMenu() {
		System.out.println("\n=== Billing Options ===");
		System.out.println("1. Generate new bill");
		System.out.println("2. Display bills for a user");
		System.out.println("0. Back");

		switch (input.nextInt()) {
		case 1 -> generateBill();
		case 2 -> displayUserBills();
		default -> 
		{
		}
		}
	}

	public static void generateBill(){
		input.nextLine();
		System.out.print("Enter User ID: ");
		String userID = input.nextLine();
		User selectedUser = null;

		for (User user : users) {
			if (user.getUserID().equalsIgnoreCase(userID)) {
				selectedUser = user;
				break;
			}
		}

		if (selectedUser == null || selectedUser.getSubscription() == null) {
			System.out.println("User not found or has no subscription.");
			return;
		}

		System.out.println("Select discount:");

		int i = 1;
		for (Discount discounts : Discount.values()) {
			System.out.println(i++ + "." + discounts);
		}

		int discountChoice = input.nextInt();
		input.nextLine();

		if (discountChoice < 1 || discountChoice > Discount.values().length) {
			System.out.println("Invalid discount choice.");
			return;
		}

		System.out.print("Due date: ");
		String dueDate = input.nextLine();
		// whatever
		//	selectedUser.setDiscount(Discount.values()[discountChoice - 1]);

	}

	private static void displayUserBills() {
		input.nextLine();
		System.out.print("Enter User ID: ");
		String userID = input.nextLine();
		for (User user : users) {
			if (user.getUserID().equalsIgnoreCase(userID)) {
				if (user.getBills().isEmpty()) {
					System.out.println("No bills found.");
				} else {
					for (Bill bill : user.getBills()) {
						bill.displayInfo();
					}
				}
				return;
			}
		}
		System.out.println("User not found.");
	}

	public static  void selectBillingOptions(){
		input.nextLine();
	}
	
	public static void showPlans() {
		// NOT STARTED!
	}

	public static void showSubscription() {
		// NOT STARTED!
	}
	public static void showAnnualRevenue() {
		System.out.println("=-=-=-=-= Annual Service Revenue =-=-=-=-=");
		System.out.println("Input a year: ");
	}

	// UUID Generator 
	public static String generateID() {
		UUID uuid = UUID.randomUUID();		
		String generatedID = uuid.toString().toUpperCase().substring(23,29);

		return generatedID;
	}

	/*
	 * This linearSearch method can be utilized for any methods that require searching. 
	 * ambot, wala pako kabalo kung paano ni i plastar
	 */
	public static <T> T linearSearch(LinkedList<T> list, String query) {

		for (T item : list) {

			if (item.toString().equalsIgnoreCase(query)) {
				return item;
			}

		}

		return null;
	}
	
	public static void displayBandwidths() {
		int i = 1;
	    for (NetworkBandwidth bandwidth : NetworkBandwidth.values()) {
	        System.out.println(i + ". " + bandwidth);
	        i++;
	    }
	}
}
