package finalProject;

import java.util.LinkedList;

public class Bill {
	private String billId;
	private String dueDate;
	private LinkedList<AnnualServiceRevenue> annualServiceRevenue;
	private Subscription subscriptions;

	public Bill(String billId, String dueDate, LinkedList<AnnualServiceRevenue> annualServiceRevenue, Subscription subscriptions) {
		this.billId = billId;
		this.dueDate = dueDate;
		this.annualServiceRevenue = annualServiceRevenue;
		this.subscriptions = subscriptions;
	}

	public String getBillId() {
		return billId;
	}

	public void setBillId(String billId) {
		this.billId = billId;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public LinkedList<AnnualServiceRevenue> getAnnualServiceRevenue() {
		return annualServiceRevenue;
	}

	public void setAnnualServiceRevenue(LinkedList<AnnualServiceRevenue> annualServiceRevenue) {
		this.annualServiceRevenue = annualServiceRevenue;
	}

	public Subscription getSubscriptions() {
		return subscriptions;
	}

	public void setSubscriptions(Subscription subscriptions) {
		this.subscriptions = subscriptions;
	}

	public double getTotalBill() {
		return 0;
	}

	public double getDiscount() {
		return 0;
	}

	public double calculateAdditionalFee() {
		return 0;
	}

	public double getOutstandingBalance() {
		return 0;
	}

	public void displayInfo() {
		// Formatting needed...
	}
}
