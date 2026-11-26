package finalProject;

import java.util.LinkedList;

public class Subscription {
    private String subscriptionName;
    private NetworkBandwidth networkBandwidth;
    private User user;
    private LinkedList<Bill> bills;

    public Subscription(String subscriptionName, NetworkBandwidth networkBandwidth, User user) {
        this.subscriptionName = subscriptionName;
        this.networkBandwidth = networkBandwidth;
        this.user = user;
        this.bills = new LinkedList<>();
    }

    
    public String getSubscriptionName() {
        return subscriptionName;
    }

    public void setSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
    }
    
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public NetworkBandwidth getNetworkBandwidth() {
        return networkBandwidth;
    }

    public void setNetworkBandwidth(NetworkBandwidth networkBandwidth) {
        this.networkBandwidth = networkBandwidth;
    }
//get all bills regardless of the year
    public LinkedList<Bill> getBills() {
        return bills;
    }

    public void setBills(LinkedList<Bill> bills) {
        this.bills = bills;
    }
//add bills to the linkedlist
    public void addBill(Bill bill){
        bills.add(bill);
    }
//filter bills by year
    public LinkedList<Bill> getBillByYear(int targetYear) {
        LinkedList<Bill> filteredBillsByYear = new LinkedList<>();

        for (Bill bill: bills){
            if(bill.getYear() == targetYear){
                filteredBillsByYear.add(bill);
            }
        }

        return filteredBillsByYear;
    }
    public void displayInfo() {
        System.out.println("Subscription Name: " + this.getSubscriptionName());
        System.out.println("Network Bandwidth: " + this.getNetworkBandwidth());
        System.out.println("Bills: " + bills);
    }
}
