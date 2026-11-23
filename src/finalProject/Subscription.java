package finalProject;

public class Subscription {
    private String subscriptionId;
    private String subscriptionName;
    private double networkBandwidth;
    private double ratePerBandwidth;

    public Subscription(String subscriptionId, String subscriptionName, double networkBandwidth, double ratePerBandwidth) {
        this.subscriptionId = subscriptionId;
        this.subscriptionName = subscriptionName;
        this.networkBandwidth = networkBandwidth;
        this.ratePerBandwidth = ratePerBandwidth;
    }

    public double getPremiumSubscription() {
        double monthlyPayment = networkBandwidth * ratePerBandwidth;
        return (monthlyPayment * 12) * 0.90;
    }

    public String displayPremiumInfo(String premiumBenefits) {
        return premiumBenefits;
    }

    public String displayRegularInfo(String regularBenefits) {
        return regularBenefits;
    }

    public void displayInfo() {
        System.out.println("Subscription ID: " + subscriptionId);
        System.out.println("Subscription Name: " + subscriptionName);
        System.out.println("Network Bandwidth: " + networkBandwidth);
        System.out.println("Rate per Bandwidth: " + ratePerBandwidth);
    }
}

