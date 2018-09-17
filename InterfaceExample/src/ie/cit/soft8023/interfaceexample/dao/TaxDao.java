package ie.cit.soft8023.interfaceexample.dao;

import ie.cit.soft8023.interfaceexample.domain.Tax;

public interface TaxDao {
	Tax getTax();
	void updateTax(Tax tax);
}
