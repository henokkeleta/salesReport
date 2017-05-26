
public class salesDefinition {
	/**
	 * this are instance variables of the salesDefinition class
	 * they are the attributes of the class.
	 * 
	 */
	private int customerNumber;
	private String customerName;
	private double salesAmount;
	private String taxCode;
      
	/**
	 * it is a default contractor. 
	 * we can not leave the compiler to come up  with its own version of default constructors since we created one
	 */

	public salesDefinition()
	{ 
		customerName= null;
		customerNumber = 0;
		salesAmount=0.0;
		taxCode= null;

	}
	/**
	 * this is a constructor which helps us to create salesDefinition object 
	 * @param newCustomerNo
	 * @param newCustomerName
	 * @param newSales
	 * @param newTaxCode
	 */
	public salesDefinition(int newCustomerNo, String newCustomerName,double newSales,String newTaxCode )
	{ 
		customerName= newCustomerName;
		customerNumber = newCustomerNo ;
		salesAmount= newSales;
		taxCode= newTaxCode;

	}
	public void setSelesDefinition(int newCustomerNo, String newCustomerName,double newSales,String newTaxCode )
	{ 
		customerName= newCustomerName;
		customerNumber = newCustomerNo ;
		salesAmount= newSales;
		taxCode= newTaxCode;
	}
  /**
   * the rest eight methods are mutators and accsesors which gives the user to access the variables and mutate the values accordingly 
   * @return
   */

	public int getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getSalesAmount() {
		return salesAmount;
	}
	public void setSalesAmount(double salesAmount) {
		this.salesAmount = salesAmount;
	}
	public String getTaxCode() {
		return taxCode;
	}
	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}
	/**
	 * The next method is overriden method which was inherited from the object class
	 * returns the string value stored.
	 */
	public String toString() {
		return "salesDefinition [customerNumber=" + customerNumber + ", customerName=" + customerName + ", salesAmount="
				+ salesAmount + ", taxCode=" + taxCode + "]";  
	}
	/**
	 * 
	 * @param sales
	 * @param code
	 * @return it returns a tax amount which also help to calculate the total sales Amount
	 */
	public double calculateTax(double sales , String code) 
	{ 
		double taxed ;
		if(code.equalsIgnoreCase("nrm"))
		{ 
			taxed = sales*0.06;

		} else if(code.equalsIgnoreCase("biz")){ 
			taxed=sales*0.45;
		}else {
			taxed=0;
		}
		return taxed;
	}
	/**
	 * 
	 * @param sales
	 * @param taxed
	 * @return  amount, which is the total amount after tax
	 */
	public double totalSalesAmount(double sales , double taxed)
	{ 
		double amount=sales-taxed;
		return amount;

	}
}
