package finalProject;

public class PremiumUser extends User {

	public PremiumUser(String firstName, String lastName, String userId, String address) {
		super(firstName, lastName, userId, address);
	}

	public double getSubscriptionRate() {
		if (getSubscription() == null) {
			return 0;
		}
		return (getSubscription().getMonthlyRate() * 12) * Discount.SEASONALPREMIUMDISCOUNT.getDiscountRate();
	}

	@Override
	public String getUserType() {
		return "Premium";
	}

}
