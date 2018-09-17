package ie.cit.soft8023.interfaceexample.service;

import ie.cit.soft8023.interfaceexample.dao.TaxDao;
import ie.cit.soft8023.interfaceexample.domain.Tax;

public class TaxServiceImpl implements TaxService {

	private TaxDao taxDao;
	
	public TaxServiceImpl(TaxDao taxDao) {
		this.taxDao = taxDao;
	}

	@Override
	public double calculateTax(double grossSalary) {
		Tax tax = taxDao.getTax();
		
		if (grossSalary < tax.getLowerThreshold()) {
			return grossSalary * tax.getLowerTaxRate();
		}
	
		double totalTax = tax.getLowerThreshold() * tax.getLowerTaxRate();
		totalTax += (grossSalary - tax.getLowerThreshold()) * tax.getUpperTaxRate();
		
		return totalTax;
	}

}
