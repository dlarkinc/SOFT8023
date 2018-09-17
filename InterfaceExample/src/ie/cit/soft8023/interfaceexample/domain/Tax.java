package ie.cit.soft8023.interfaceexample.domain;

public class Tax {
	private double lowerThreshold;
	private double lowerTaxRate;
	private double upperTaxRate;
	
	public Tax(double lowerThreshold, double lowerTaxRate, double upperTaxRate) {
		this.lowerThreshold = lowerThreshold;
		this.lowerTaxRate = lowerTaxRate;
		this.upperTaxRate = upperTaxRate;
	}

	public double getLowerThreshold() {
		return lowerThreshold;
	}

	public void setLowerThreshold(double lowerThreshold) {
		this.lowerThreshold = lowerThreshold;
	}

	public double getLowerTaxRate() {
		return lowerTaxRate;
	}

	public void setLowerTaxRate(double lowerTaxRate) {
		this.lowerTaxRate = lowerTaxRate;
	}

	public double getUpperTaxRate() {
		return upperTaxRate;
	}

	public void setUpperTaxRate(double upperTaxRate) {
		this.upperTaxRate = upperTaxRate;
	}
	
	
}
