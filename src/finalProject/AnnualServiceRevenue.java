package finalProject;

import java.util.LinkedList;

public class AnnualServiceRevenue {
	private int year;
	private double totalRevenue;
	private LinkedList<Bill> bills;
	
	public AnnualServiceRevenue(int year) {
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getTotalRevenue() {
		return totalRevenue;
	}

	public void setTotalRevenue(double totalRevenue) {
		this.totalRevenue = totalRevenue;
	}

	public LinkedList<Bill> getBills() {
		return bills;
	}

	public void setBills(LinkedList<Bill> bills) {
		this.bills = bills;
	}

	public double getNetResult() {
		totalRevenue = 0;
		
		for (Bill b : bills) {
			totalRevenue += b.getTotalBill();
		}
		return totalRevenue;
	}

	// generateReport, pwede? idk, dapat abi unambiguous kag simplified ang naming schemes
	public void displayAnnualServiceRevenue() {
		System.out.println("Year: " + year);
		System.out.println("Bills: " + bills.size());
		System.out.printf("Net Result: Php %.2f%n", getNetResult());
	}

}
