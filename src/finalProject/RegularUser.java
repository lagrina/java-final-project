package finalProject;

public class RegularUser extends User {

	public RegularUser(String firstName, String lastName, String userId, String address, Subscription subscription) {
		super(firstName, lastName, userId, address, subscription);
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
//		return subscription.getMonthlyRate();
		return 0;
	}

	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Plan Type: Regular (postpaid monthly)");
		System.out.printf("Total Amount Due: Php %.2f%n", getTotalAmountDue());
	}
}
