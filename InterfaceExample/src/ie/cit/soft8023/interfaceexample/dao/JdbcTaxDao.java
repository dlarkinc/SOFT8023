package ie.cit.soft8023.interfaceexample.dao;

import ie.cit.soft8023.interfaceexample.domain.Tax;

public class JdbcTaxDao implements TaxDao {

	@Override
	public Tax getTax() {
		// We are pretending here to use JDBC to run a SQL statement, e.g. SELECT * FROM tax WHERE year = <current year>
		Tax tax = new Tax(20000, 0.2, 0.41);
		return tax;
	}

	@Override
	public void updateTax(Tax tax) {
		// This would execute an UPDATE SQL statement
	}

}
