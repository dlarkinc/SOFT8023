package ie.cit.soft8023.interfaceexample.dao;

import ie.cit.soft8023.interfaceexample.domain.Tax;
import ie.cit.soft8023.interfaceexample.legacy.MyAncientHierarchicalDatabase;

public class AncientAdapterTaxDao implements TaxDao {

	public AncientAdapterTaxDao() {
		// TODO Auto-generated constructor stub
	}
	
	// we are adpating this legacy class which does not return a single neat domain object
	private MyAncientHierarchicalDatabase ancientDb = new MyAncientHierarchicalDatabase(); 
		
	@Override
	public Tax getTax() {
		// TODO Auto-generated method stub
		Tax t = new Tax(ancientDb.getLowerTaxPercentage(), ancientDb.getHigherTaxPercentage(), ancientDb.getTaxThreshold());

		return t;
	}
	
	@Override
	public void updateTax(Tax tax) {
		// TODO Auto-generated method stub
		
	}
}

