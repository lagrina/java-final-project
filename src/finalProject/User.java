package finalProject;

public class User {
	private String fName;
	private String lName;
	private String userID;
	private String address;
	private Subscription subscription;
	private Bill bills;
	private Discount discount;
	
	public String getfName() {
		return fName;
	}
	
	public void setfName(String fName) {
		this.fName = fName;
	}
	
	public String getlName() {
		return lName;
	}
	
	public void setlName(String lName) {
		this.lName = lName;
	}
	
	public String getUserID() {
		return userID;
	}
	
	public void setUserID(String userID) {
		this.userID = userID;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Subscription getSubscription() {
		return subscription;
	}
	
	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}
	
	public Bill getBills() {
		return bills;
	}
	
	public void setBills(Bill bills) {
		this.bills = bills;
	}
	
	public Discount getDiscount() {
		return discount;
	}
	
	public void setDiscount(Discount discount) {
		this.discount = discount;
	}
	
	public String getFullName() {
		return this.fName + " " + this.lName;
	}
	
	public void displayInfo() {
		// I need the formatting diri, please DM!
	}
}
