package ie.cit.soft8023.interfaceexample.dao;

import ie.cit.soft8023.interfaceexample.domain.Tax;

public class MongoTaxDao implements TaxDao {

	@Override
	public Tax getTax() {
		// We are pretending here to use a MongoDB Java library to get the tax document
		Tax tax = new Tax(20000, 0.2, 0.41);
		return tax;
	}

	@Override
	public void updateTax(Tax tax) {
		// This would execute an UPDATE SQL statement
	}

}