package finalProject;

public class Subscription {
    private String subscriptionID;
    private String subscriptionName;
    private double subscriptionPrice;
    private int subscriptionBillingPeriod;
    private boolean isPremiumSubscription;
    private double networkBandwidth;
    private double ratePerMbps;

    public Subscription(String subscriptionID, String subscriptionName,
            double subscriptionPrice, int subscriptionBillingPeriod,
            boolean isPremiumSubscription, double networkBandwidth,
            double ratePerMbps) {

        this.subscriptionID = subscriptionID;
        this.subscriptionName = subscriptionName;
        this.subscriptionPrice = subscriptionPrice;
        this.subscriptionBillingPeriod = subscriptionBillingPeriod;
        this.isPremiumSubscription = isPremiumSubscription;
        this.networkBandwidth = networkBandwidth;
        this.ratePerMbps = ratePerMbps;
    }

    public String getSubscriptionID() {
        return subscriptionID;
    }

    public String getSubscriptionName() {
        return subscriptionName;
    }

    public double getSubscriptionPrice() {
        return subscriptionPrice;
    }

    public int getSubscriptionBillingPeriod() {
        return subscriptionBillingPeriod;
    }

    public boolean isPremiumSubscription() {
        return isPremiumSubscription;
    }

    public double getNetworkBandwidth() {
        return networkBandwidth;
    }

    public double getRatePerMbps() {
        return ratePerMbps;
    }

    public double getSubscriptionRate() {
        return subscriptionPrice + (networkBandwidth * ratePerMbps);
    }

    public void displayInfo() {
        System.out.println("Subscription ID: " + subscriptionID);
        System.out.println("Subscription Name: " + subscriptionName);
        System.out.println("Subscription Price: " + subscriptionPrice);
        System.out.println("Billing Period: " + subscriptionBillingPeriod + " months");
        System.out.println("Premium Subscription: " + (isPremiumSubscription ? "Yes" : "No"));
        System.out.println("Network Bandwidth: " + networkBandwidth + " Mbps");
        System.out.println("Rate per Mbps: " + ratePerMbps);
        System.out.println("Subscription Rate: " + getSubscriptionRate());
    }
}
