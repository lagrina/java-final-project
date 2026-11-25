package finalProject;

public class RegularUser extends User {

	public RegularUser(String firstName, String lastName, String userId, String address) {
		super(firstName, lastName, userId, address);
	}

	@Override
	public String getUserType() {
		return "Regular";
	}
	
	@Override
	public double getSubscriptionRate() {
		if (getSubscription() == null) {
			return 0;
		}
		return subscription.getMonthlyRate();
	}

	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Plan Type: Regular (postpaid monthly)");
		System.out.printf("Total Amount Due: Php %.2f%n", getTotalAmountDue());
	}
}
