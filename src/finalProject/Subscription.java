package finalProject;

import java.util.LinkedList;

public class Subscription {
	private String subscriptionName;
	private NetworkBandwidth networkBandwidth;
	private LinkedList<Bill> bills;
	private User user; // 

	public Subscription(String subscriptionName, NetworkBandwidth networkBandwidth) {
		this.subscriptionName = subscriptionName;
		this.networkBandwidth = networkBandwidth;
		this.bills = new LinkedList<>();
	}

	public String getSubscriptionName() {
		return subscriptionName;
	}

	public void setSubscriptionName(String subscriptionName) {
		this.subscriptionName = subscriptionName;
	}

	public NetworkBandwidth getNetworkBandwidth() {
		return networkBandwidth;
	}

	public void setNetworkBandwidth(NetworkBandwidth networkBandwidth) {
		this.networkBandwidth = networkBandwidth;
	}

	public LinkedList<Bill> getBills() {
		return bills;
	}

	public void setBills(LinkedList<Bill> bills) {
		this.bills = bills;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public double getMonthlyRate() {
		return networkBandwidth.getNetworkRate();
	}

	public void displayInfo() {
		System.out.println("Subscription Name: " + subscriptionName);
		System.out.println("Network Bandwidth: " + networkBandwidth);
		System.out.println("Bills: " + bills);
	}
}
