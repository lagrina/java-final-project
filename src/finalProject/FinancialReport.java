package finalProject;

public class FinancialReport {
	private String reportId;
	private String reportPeriodStart;
	private String reportPeriodEnd;
	private Expenditure expenses;
	
	public String getReportId() {
		return reportId;
	}
	
	public void setReportId(String reportId) {
		this.reportId = reportId;
	}
	
	public String getReportPeriodStart() {
		return reportPeriodStart;
	}
	
	public void setReportPeriodStart(String reportPeriodStart) {
		this.reportPeriodStart = reportPeriodStart;
	}
	
	public String getReportPeriodEnd() {
		return reportPeriodEnd;
	}
	
	public void setReportPeriodEnd(String reportPeriodEnd) {
		this.reportPeriodEnd = reportPeriodEnd;
	}
	
	public Expenditure getExpenses() {
		return expenses;
	}
	
	public void setExpenses(Expenditure expenses) {
		this.expenses = expenses;
	}
	
	public double getNetResult() {
		// hi needed ko formula diri
		return 0;
	}
	
	public void displayFinancialReport() {
		// Formatting needed
	}
	

}
