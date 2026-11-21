package finalProject;

import java.util.*;

public class Main {
	public static final Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		boolean running = true;

		while(running) {
			displayMenu();
			System.out.println("Choose an option: ");
			switch(input.nextInt()) {
			case 1:
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

		}
	}

	public static void displayMenu() {
		System.out.println();
		System.out.println("1. Register a new user");
		System.out.println("2. Generate bill");
		System.out.println("3. View user and bills");
		System.out.println("4. View plans and rates");
		System.out.println("5. View user subscription and benefits");
		System.out.println("6. View bills");
		System.out.println("7. Search users (by ID)");
		System.out.println("8. Collections");
		System.out.println("9.");
		System.out.println("10.");
		

	}

}
