package finalProject;

public class Subscription {
	private String subscriptionID;
	private String subscriptionName;
	private double subscrptionPrice;
	private int subscriptionBillingPeriod;
	private boolean isPwd;
	private boolean isPremiumSubscription;
	private double networkBandwidth;
	private double ratePerMbps;
	
	public String getSubscriptionID() {
		return subscriptionID;
	}
	public void setSubscriptionID(String subscriptionID) {
		this.subscriptionID = subscriptionID;
	}
	public String getSubscriptionName() {
		return subscriptionName;
	}
	public void setSubscriptionName(String subscriptionName) {
		this.subscriptionName = subscriptionName;
	}
	public double getSubscrptionPrice() {
		return subscrptionPrice;
	}
	public void setSubscrptionPrice(double subscrptionPrice) {
		this.subscrptionPrice = subscrptionPrice;
	}
	public int getSubscriptionBillingPeriod() {
		return subscriptionBillingPeriod;
	}
	public void setSubscriptionBillingPeriod(int subscriptionBillingPeriod) {
		this.subscriptionBillingPeriod = subscriptionBillingPeriod;
	}
	public boolean isPwd() {
		return isPwd;
	}
	public void setPwd(boolean isPwd) {
		this.isPwd = isPwd;
	}
	public boolean isPremiumSubscription() {
		return isPremiumSubscription;
	}
	public void setPremiumSubscription(boolean isPremiumSubscription) {
		this.isPremiumSubscription = isPremiumSubscription;
	}
	public double getNetworkBandwidth() {
		return networkBandwidth;
	}
	public void setNetworkBandwidth(double networkBandwidth) {
		this.networkBandwidth = networkBandwidth;
	}
	public double getRatePerMbps() {
		return ratePerMbps;
	}
	public void setRatePerMbps(double ratePerMbps) {
		this.ratePerMbps = ratePerMbps;
	}
	
	

}
