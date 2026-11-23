package finalProject;

public class Subscription {
    private String subscriptionId;
    private String subscriptionName;
    private double networkBandwidth;

    public Subscription(String subscriptionId, String subscriptionName, double networkBandwidth) {
        this.subscriptionId = subscriptionId;
        this.subscriptionName = subscriptionName;
        this.networkBandwidth = networkBandwidth;
    }

    public double getPremiumSubscription() {
        return networkBandwidth;
    }

    public String displayInfo(String premiumBenefits) {
        return premiumBenefits;
    }

    public String displayInfo(String regularBenefits) {
        return regularBenefits;
    }

    public void displayInfo() {
        System.out.println("Subscription ID: " + subscriptionId);
        System.out.println("Subscription Name: " + subscriptionName);
        System.out.println("Network Bandwidth: " + networkBandwidth);
    }
}

