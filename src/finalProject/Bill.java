package finalProject;

import java.util.UUID;

public class Bill {
	private String billId;
	private Subscription subscription;
	private Discount discount;
	//this is applicable if there is an additional fee for late payemnt for regular customer
	private String userType; 
	private double amountPaid;
	private double outstandingBalance;
	private int year;
	private int month;
	private int date;
	
	public Bill(String billId, Discount discount, String userType, double amountPaid, double outstandingBalance, int year, int month, int date) { //change the constructor parameters
		this.billId = billId;
		this.discount = discount;
		this.userType = subscription.getUser().getUserType();
		this.amountPaid = amountPaid;
		this.outstandingBalance = outstandingBalance;
		this.month = month;
		this.date = date;
	}
	
	public String getBillId() {
		return billId;
	}

	public void setBillId(String billId) {
		this.billId = billId;
	}

	public Subscription getSubscriptionFee() {
		return subscription; 
		//get the network bandwidth of this on the subscription class
	}

	public void setSubscriptionFee(Subscription subscription) {
		this.subscription = subscription;
	}

	public double getOutstandingBalance() {
		return outstandingBalance;
	}

	public void setOutstandingBalance(double outstandingBalance) {
		this.outstandingBalance = outstandingBalance;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	// methods
	public double getTotalBill() {
		double rate = userType.equals("REGULAR")
				? subscription.getNetworkBandwidth().getNetworkRate()
						: subscription.getUser().getSubscriptionRate();

		if (userType.equals("REGULAR")) rate += calculateAdditionalFee();

		double discountRate = 0;
		// EXPLANATION! if discount is PWD or SENIORCITIZEN, 20%. kung may SEASONALREGULARDISCOUNT, then muna
		if (discount == Discount.PWD || discount == Discount.SENIORCITIZEN)
			discountRate = 0.20;
		else if (discount == Discount.SEASONALREGULARDISCOUNT)
			discountRate = 0.05;
		else if (discount == Discount.SEASONALPREMIUMDISCOUNT)
			discountRate = 0.10;

		return rate - (rate * discountRate);
	}

	public double getTotalDiscount() {
		double rate = this.subscription.getNetworkBandwidth().getNetworkRate();

		return rate * switch (this.discount) {
		case PWD, SENIORCITIZEN -> 0.20;
		case SEASONALREGULARDISCOUNT -> 0.05;
		case SEASONALPREMIUMDISCOUNT -> 0.10;
		default -> 1.0;
		};
	}

	public double calculateAdditionalFee(){
		// for late payers and regular users only
		double additionalFee = this.subscription.getNetworkBandwidth().getNetworkRate();
		return additionalFee * 0.01;
	}
	//	check again this logic; if outstandingBalance >= getTotalBIll -> must pay the outstanding balance and the current bill
	public double calculateOutstandingBalance() {
		double totalAmountDue = this.getTotalBill() - this.amountPaid;
		if (totalAmountDue == 0) {
			return 0;
		} else {
			return totalAmountDue + getTotalBill();
		}
	}
	
	public String getDueDate(){
		return year + " " + month + " " + date;	
	}

	public void displayInfo(){
		//user info 
		//subscription info
		if (userType == "PREMIUM") {
			System.out.println("Bill ID: P" + generateID());
		} else {
			System.out.println("Bill Id: R" + generateID());
		}
		
		System.out.println("Discount Type: " + this.discount.getDescription()); 
		System.out.println("Discount Rate: " + this.discount.getDiscountRate());
		System.out.println("Net Total Bill: " + this.getTotalBill());
		System.out.println("Outstanding Balance: " + this.calculateOutstandingBalance());
		System.out.println("Due Date: " + this.getDueDate());
	}
	// UUID Generator
	public static String generateID() {
		UUID uuid = UUID.randomUUID();		
		String generatedID = uuid.toString().toUpperCase().substring(23,29);
		return generatedID;
	}
}
