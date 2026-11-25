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
	private String dueDate;
//constructor 
	public Bill(String billId, Discount discount, String userType, double amountPaid, double outstandingBalance, String dueDate) { //change the constructor parameters
		this.billId = billId;
		this.discount = discount;
		this.userType = subscription.getUser().getUserType();
		this.amountPaid = amountPaid;
		this.outstandingBalance = outstandingBalance;
		this.dueDate = dueDate;
	}
// getters and setters
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

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
// methods
	public double getTotalBill(){
		if(this.discount != Discount.NOTAVAILABLE && userType == "REGULAR"){ 
			return calculateAdditionalFee() + this.subscription.getNetworkBandwidth().getNetworkRate() - getTotalDiscount();
			//discounted and with additional fee 
		}else if(this.discount == Discount.NOTAVAILABLE && userType == "REGULAR"){
			return calculateAdditionalFee() + this.subscription.getNetworkBandwidth().getNetworkRate();
			//with additional fee but not discounted
		}else if(userType == "REGULAR"){
			return this.subscription.getNetworkBandwidth().getNetworkRate();
			// regular but not discounted and with no additional fee
		}else if(this.discount == Discount.PWD || this.discount == Discount.SENIORCITIZEN && userType == "PREMIUM"){
			return this.subscription.getUser().getSubscriptionRate() * 0.2;
			// discounted(premium and pwd) and premium user
		}else if(this.discount == Discount.SEASONALPREMIUMDISCOUNT && userType == "PREMIUM"){
			return this.subscription.getUser().getSubscriptionRate() * 0.1;
			// seasonal discount and premium user
		}else{
			return this.subscription.getUser().getSubscriptionRate();
			// premium user but not discounted
		}	
	}

	public double getTotalDiscount() { //reusable only for regular discount
		if(this.discount == Discount.PWD || this.discount == Discount.SENIORCITIZEN){
			return this.subscription.getNetworkBandwidth().getNetworkRate() * 0.2;
		}else if (this.discount == Discount.SEASONALREGULARDISCOUNT){
			return  this.subscription.getNetworkBandwidth().getNetworkRate() * 0.05;
		}else if(this.discount == Discount.SEASONALPREMIUMDISCOUNT){
			return this.subscription.getNetworkBandwidth().getNetworkRate() * 0.1;
		}else{
			return this.subscription.getNetworkBandwidth().getNetworkRate();
		}
	}

	public double calculateAdditionalFee(){
		// for late payers and regular users only
		double additionalFee = this.subscription.getNetworkBandwidth().getNetworkRate();
		return additionalFee * 0.01;
	}
//check again this logic; if outstandingBalance >= getTotalBIll -> must pay the outstanding balance and the current bill
	public double calculateOutstandingBalance(){
		double totalAmountDue = this.getTotalBill() - this.amountPaid;
		if(totalAmountDue == 0){
			return 0;
		}else{
			return totalAmountDue + getTotalBill();
		}
	}
	public void displayInfo(){
		//user info 
		//subscription info
		if(userType == "PREMIUM"){
			System.out.println("Bill ID: P" + generateID());
		}else{
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
