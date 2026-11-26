package finalProject;

import java.util.LinkedList;
import java.util.UUID;

public class AnnualServiceRevenue {
	private String revenueId;
	private LinkedList<Bill> bills;
	private int targetYear;
	
// constructor
	public AnnualServiceRevenue(int targetYear) {
		this.targetYear = targetYear;
		this.bills = new LinkedList<>();
	}

// getters and setters 
	public String getRevenueId() {
		return revenueId;
	}

	public void setRevenueId(String revenueId) {
		this.revenueId = revenueId;
	}

	public LinkedList<Bill> getBills() {
		return bills;
	}

	public void setBills(LinkedList<Bill> bills) {
		this.bills = bills;
	}

// methods
	//check the bill's year and if matches automatically add the bill
	public void addBill(Bill bill){
		if(bill.getYear() == this.targetYear){
			this.bills.add(bill);
		}
	}
	//perform linear searching before using this method
	public double calculateTotalRevenue(){
		double total = 0.0;
		for(Bill bill: bills){
			total += bill.getTotalBill();
		}
		return total;
	}

	public void displayInfo(){
		// display yearly service revenue here
	}
	// UUID Generator
	public static String generateID() {
		UUID uuid = UUID.randomUUID();		
		String generatedID = uuid.toString().toUpperCase().substring(23,29);
		return generatedID;
	}
}
