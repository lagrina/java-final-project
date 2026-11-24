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

    public void displayInfo() {
        System.out.println("Subscription Name: " + subscriptionName);
        System.out.println("Network Bandwidth: " + networkBandwidth);
        System.out.println("Bills: " + bills);
    }
}
