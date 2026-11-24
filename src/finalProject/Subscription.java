package finalProject;

import java.util.LinkedList;

public class Subscription {
	private String subscriptionName;
	private NetworkBandwidth networkBandwidth;
	private LinkedList<Bill> bills;

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
	
	public double getMonthlyRate() {
		return networkBandwidth.getNetworkRate();
	}

	public void displayInfo() {
		System.out.println("Subscription Name: " + subscriptionName);
		System.out.println("Network Bandwidth: " + networkBandwidth);
		System.out.println("Bills: " + bills);
	}
}
