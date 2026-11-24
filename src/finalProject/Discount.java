package finalProject;

public enum Discount{
	PWD("PWD", 0.20),
	SENIORCITIZEN("Senior Citizen", 0.20),
	SEASONALREGULARDISCOUNT("Regular", 0.05),
	SEASONALPREMIUMDISCOUNT("Premium", 0.10),
	NOTAVAILABLE("Not Available", 0.00);

	private String description;
	private double discountRate;

	public String getDescription() {
		return description;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	Discount(String description, double discountRate) {
		this.description = description;
		this.discountRate = discountRate;
	}

	public boolean isEligible() {
		return isEligible;
	}

	public void setEligible(boolean isEligible) {
		this.isEligible = isEligible;
	}

	public double getTotalDiscount() {
		// Formula needed...
		return 0;
	}

	public void displayInfo() {
		// Formatting needed...
	}
}
