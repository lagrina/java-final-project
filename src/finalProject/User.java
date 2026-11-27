package finalProject;

import java.util.LinkedList;

public abstract class User {
	private String firstName;
	private String lastName;
	private String userID;
	private String address;
	protected Subscription subscription;
	private LinkedList<Bill> bills = new LinkedList<Bill>();

	public User(String firstName, String lastName, String userID, String address, Subscription subscription) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.userID = userID;
		this.address = address;
		this.subscription = subscription;
	}

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

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Subscription getSubscription() {
		return subscription;
	}

	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}

	public LinkedList<Bill> getBills() {
		return bills;
	}

	public void setBills(LinkedList<Bill> bills) {
		this.bills = bills;
	}

	public void addBill(Bill bill) {
		bills.add(bill);
	}

	public int getTotalBills() {
		return bills.size();
	}

	public double getTotalAmountDue() {
		double total = 0;
		for (Bill bill : bills) {
			total += bill.getOutstandingBalance();
		}
		return total;
	}

	public String getFullName() {
		return this.firstName + " " + this.lastName;
	}

	public abstract String getUserType();

	public abstract double getSubscriptionRate();

	public void displayInfo() {
		System.out.println("--User Information--");
		System.out.println("Full Name: " + getFullName());
		System.out.println("User ID: " + userID);
		System.out.println("Address: " + address);

		if (subscription != null) {
			// System.out.println("Subscription: " + subscription.getSubscriptionName());
		} else {
			System.out.println("Subscription: None");
		}

		System.out.println("Bills: ");
		if (bills.isEmpty()) {
			System.out.println(" no bills");
		} else {
			for (Bill bill : bills) {
				System.out.printf(" - %s | Total: Php %.2f | Balance: Php %.2f | Due: %s%n",
						bill.getBillId(), bill.getTotalBill(), bill.getOutstandingBalance(), bill.getDueDate());
			}
		}
	}
}
