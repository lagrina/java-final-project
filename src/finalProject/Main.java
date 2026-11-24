package finalProject;

import java.util.*;

public class Main {
	public static final Scanner input = new Scanner(System.in);
	public static final LinkedList<User> users = new LinkedList<>();

	public static void main(String[] args) {
		boolean running = true;

		while(running) {
			try {
				displayMenu();
				System.out.print("Choose an option: ");
				switch(input.nextInt()) {
				case 1:
					manageUser();
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					break;
				case 7:
					break;
				case 8:
					break;
				case 9:
					break;
				case 10:
					break;
				case 0:
					break;
				default:
					System.out.println("Invalid choice, try again!");
					break;
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
		System.out.println("2. Generate bill");
		//		System.out.println("3. View user and bills");
		//		System.out.println("4. View plans and rates");
		//		System.out.println("5. View user subscription and benefits");
		//		System.out.println("6. View bills");
		//		System.out.println("7. Search users (by ID)");
		//		System.out.println("8. Collections");
		//		System.out.println("9.");
		//		System.out.println("10.");
	}

	public static void manageUser() {
		System.out.println("\n=== User Management ===");
		System.out.println("1. Add new user");
		System.out.println("2. List users");
		System.out.println("3. Fetch user info");
		System.out.println("4. Delete existing user");
		System.out.println("5. Back to main menu");


		switch(input.nextInt()) {
		case 1:
			addUser();
			break;
		case 2:
			listUsers();
			break;
		case 3:
			displayUserInfo();
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

	public static void addUser() {
		input.nextLine();
		System.out.println("Add user:");

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

		users.add(new User(firstName, lastName, userID, barangay + " " + town));
	}

	public static void listUsers() {

		if (users.isEmpty()) {
			System.out.println("User is empty, please add a user.");
		} else {
			System.out.println("=-=-= Users List =-=-=");

			int counter = 1;

			for (User user : users) {
				System.out.println(counter + ". " + user.getUserID());
				counter++;
			}
		}
	}

	public static void displayUserInfo() {
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

}
