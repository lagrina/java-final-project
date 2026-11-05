package finalProject;

public class Bill {
	private String billId;
	private int billingPeriod;
	private double subtotalBill;
	private double billDiscount;
	private double billTotalAmount;
	private String dueDate;
	
	public String getBillId() {
		return billId;
	}
	
	public void setBillId(String billId) {
		this.billId = billId;
	}
	
	public int getBillingPeriod() {
		return billingPeriod;
	}
	
	public void setBillingPeriod(int billingPeriod) {
		this.billingPeriod = billingPeriod;
	}
	
	public double getSubtotalBill() {
		return subtotalBill;
	}
	
	public void setSubtotalBill(double subtotalBill) {
		this.subtotalBill = subtotalBill;
	}
	
	public double getBillDiscount() {
		return billDiscount;
	}
	
	public void setBillDiscount(double billDiscount) {
		this.billDiscount = billDiscount;
	}
	
	public double getBillTotalAmount() {
		return billTotalAmount;
	}
	
	public void setBillTotalAmount(double billTotalAmount) {
		this.billTotalAmount = billTotalAmount;
	}
	
	public String getDueDate() {
		return dueDate;
	}
	
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	
	public double getTotalBill() {
		// Formula needed....
		return 0;
	}
	
	public void displayInfo() {
		// Formatting needed...
	}
}
