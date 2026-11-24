package finalProject;

public class PremiumUser extends User {
	
	public PremiumUser(String firstName, String lastName, String userId, String address) {
		super(firstName, lastName, userId, address);
	}

	public double getSubscriptionRate() {
		if (getSubscription() == null) {
			return 0;
		}
		double annualRate = (this.subscription.getNetworkBandwidth().getNetworkRate());
		return (annualRate * 12) * 0.1;
	}

	@Override
	public String getUserType() {
		return "Premium";
	}

}
