package ie.cit.soft8023.interfaceexample.dao;

import ie.cit.soft8023.interfaceexample.domain.Tax;

public final class JdbcTaxDao implements TaxDao {

	// private Connection c;  // this implementation of TaxDao would have lots of JDBC library stuff
	
	private static JdbcTaxDao INSTANCE;
	
    private Tax tax;

    // make sure the constructor is private so that can't create many new objects with new keyword
    private JdbcTaxDao() {
    	
    }
    
    // Our factory method.
    // this approach is the most common approach to singletons,
    // but not the only one or best (see Mongo version for alternative).
    // This is also the "lazy initialization" approach to singletons.
    public static JdbcTaxDao getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new JdbcTaxDao();
        }
         
        return INSTANCE;
    }
    
	@Override
	public Tax getTax() {
		// We are pretending here to use JDBC to run a SQL statement, e.g. SELECT * FROM tax WHERE year = <current year>
		tax = new Tax(20000, 0.2, 0.41);
		return tax;
	}

	@Override
	public void updateTax(Tax tax) {
		// This would execute an UPDATE SQL statement
	}

}
