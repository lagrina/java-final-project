package finalProject;

public class Premium {
	private String planId;
	private String planName;
	private String premiumBenefits;
	private double annualSubscriptionFee;
	
	public String getPlanId() {
		return planId;
	}
	
	public void setPlanId(String planId) {
		this.planId = planId;
	}
	
	public String getPlanName() {
		return planName;
	}
	
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	
	public String getPremiumBenefits() {
		return premiumBenefits;
	}
	
	public void setPremiumBenefits(String premiumBenefits) {
		this.premiumBenefits = premiumBenefits;
	}
	
	public double getAnnualSubscriptionFee() {
		return annualSubscriptionFee;
	}
	
	public void setAnnualSubscriptionFee(double annualSubscriptionFee) {
		this.annualSubscriptionFee = annualSubscriptionFee;
	}
	
	public double getSubscriptionRate() {
		// Formula needed!
		return 0;
	}
	
	public void displayInfo() {
		// Formatting needed!
	}

}
