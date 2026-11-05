package finalProject;

public class Discount {
	private String discountId;
	private String discountType;
	private double discountRate;
	private boolean isEligible;
	
	public String getDiscountId() {
		return discountId;
	}
	
	public void setDiscountId(String discountId) {
		this.discountId = discountId;
	}
	
	public String getDiscountType() {
		return discountType;
	}
	
	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}
	
	public double getDiscountRate() {
		return discountRate;
	}
	
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	public boolean isEligible() {
		return isEligible;
	}
	
	public void setEligible(boolean isEligible) {
		this.isEligible = isEligible;
	}
}
