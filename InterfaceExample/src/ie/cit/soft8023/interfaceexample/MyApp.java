package ie.cit.soft8023.interfaceexample;

import ie.cit.soft8023.interfaceexample.dao.JdbcTaxDao;
import ie.cit.soft8023.interfaceexample.dao.MongoTaxDao;
import ie.cit.soft8023.interfaceexample.dao.TaxDao;
import ie.cit.soft8023.interfaceexample.service.TaxService;
import ie.cit.soft8023.interfaceexample.service.TaxServiceImpl;

public class MyApp {

	private static void JdbcVersion() {
		TaxDao taxDao = JdbcTaxDao.getInstance();
		TaxService taxService = new TaxServiceImpl(taxDao);

		// Calculate tax for salary of 16,500
		System.out.println("Tax payable on 16,500 is " + taxService.calculateTax(16500));
		
		// Calculate tax for salary of 50,000
		System.out.println("Tax payable on 50,000 is " + taxService.calculateTax(50000));		
	}

	
	private static void MongoVersion() {
		TaxDao taxDao = MongoTaxDao.INSTANCE;
		TaxService taxService = new TaxServiceImpl(taxDao);

		// Calculate tax for salary of 16,500
		System.out.println("Tax payable on 16,500 is " + taxService.calculateTax(16500));
		
		// Calculate tax for salary of 50,000
		System.out.println("Tax payable on 50,000 is " + taxService.calculateTax(50000));		
	}
	
	public static void main(String[] args) {

		JdbcVersion();
		MongoVersion();
			
	}

}
