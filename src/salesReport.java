import java.util.Scanner;
/**
 * 
 * @author Henok Berhe
 * 05/26/2017
 * This program does prompt the user for entries and set the values 
 * and uses the data entered to instantiate the salesDefinition object and work on it
 * then display the results using methods in SalesDefinition class
 *
 */

public class salesReport {
	static Scanner scan= new Scanner(System.in);
	public static void main(String[] args) {
		//First  we instantiate an object of person so that we are able to use the methods in the salesDefinition class( the person object belongs to the sales definition class)
	
		salesDefinition person = new salesDefinition();
		String input="N";
	
		
		do{
			System.out.println("enter the customer name");
			String name= scan.nextLine();
			person.setCustomerName(name);
			System.out.println("enter the customer number");
			int number= scan.nextInt();
			person.setCustomerNumber(number);
			System.out.println("enter the sales amount");
			double sales= scan.nextDouble();
			person.setSalesAmount(sales);
			scan.nextLine();
			System.out.println("enter the tax code");
			String tax= scan.nextLine();
			person.setTaxCode(tax);
			double calcTax =person.calculateTax(sales, tax);
			System.out.println("customer Id:"+ " "+person.getCustomerNumber());
			System.out.println("customer Name:"+ " "+person.getCustomerName());
			System.out.println("customer sales Amount:"+ " "+person.getSalesAmount());
			System.out.println("customer code:"+ " "+person.getTaxCode());
			System.out.println("Total Amount Due:"+person.totalSalesAmount(sales,calcTax));
			/**
			 * the next method which is commented out is an alternative way to display the desired results 
			 * using a toString method found in the salesDefinition class(it is an overridden version of toString method in object class
			 */
			//System.out.println(person.toString());//you can invoke this method alternatively
			
			System.out.println("Do you want to enter another record. please answer Y or N");
			 input = scan.nextLine();
			
			
		

	}while(input.equalsIgnoreCase("Y"));
		/**
		 * the expression in the while is to check whether the user wishes to continue or quit the program
		 */
	}
}
