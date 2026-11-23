package finalProject;

public class Discount {
	private boolean isEligible;
	private String discountId;
	private DiscountType discountType;
	private double discountRate;
	
	
	public Discount(boolean isEligible, String discountId, double discountRate, DiscountType discountType){
		this.isEligible = isEligible;
		this.discountId = discountId;
		this.discountType = discountType;
		this.discountRate = discountRate;
	}

	public boolean isEligible() {
		return isEligible;
	}
	
	public void setEligible(boolean isEligible) {
		this.isEligible = isEligible;
	}

	public String getDiscountId() {
		return discountId;
	}
	
	public void setDiscountId(String discountId) {
		this.discountId = discountId;
	}

	public double getDiscountRate() {
		return discountRate;
	}
	
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

		public DiscountType getDiscountType(){
		return discountType;
	}
	
	public void setDiscountType(DiscountType discountType){
		this.discountType = discountType;
	}
	
	public double getTotalDiscount() {
		switch (discountType){
			case isPwd:
			return 0.05;
		
		case isSenior:
			return 0.05;

		case isSeasonal:
			return 0.10;
		
		default:	
			return 0.0;
		}
	}
	
	public void displayInfo() {
		
	}

	public double calculateAnnualSeasonalDiscount( ){
		if(){
			
		}
	}

	public double calculateMonthlySeasonalDiscount(){
		
	}
}
