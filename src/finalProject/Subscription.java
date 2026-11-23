package finalProject;

public class Subscription {
    private String subscriptionName;
    private double networkBandwidth;
    private Bill bills;

    public Subscription(String subscriptionName, double networkBandwidth, Bill bills) {
        this.subscriptionName = subscriptionName;
        this.networkBandwidth = networkBandwidth;
        this.bills = bills;
    }

    public void displayInfo() {
        System.out.println("Subscription Name: " + subscriptionName);
        System.out.println("Network Bandwidth: " + networkBandwidth);
        System.out.println("Bill: " + bills);
    }
}
