import java.util.Scanner;

public class softwarepackage {
	
	public static final int software_package_price = 99;  // setting the price per package
	// software_package_price is my constant

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter the total number of software  packages ordered: ");   // asking the user for the amount of packages ordered
		
		int number_of_packages = key.nextInt();
		
		if (number_of_packages < 1)  // using if else statements to find the discount to match with the amount of packages ordered
		{
			System.out.println("Invalid value for package count! Exiting the program!");
			System.exit(0);
		}
		
		double discount_rate = 0;   //  allowing decimals for input
		
		if (number_of_packages >= 10 && number_of_packages <= 19)
		{
			discount_rate = 20;
		}
		
		else if (number_of_packages >= 20 && number_of_packages <= 49)
		{
			discount_rate = 30;
		}
		
		else if (number_of_packages >= 50 && number_of_packages <= 99)
		{
			discount_rate = 40;
		}
		
		else if (number_of_packages >= 100)
		{
			discount_rate = 50;
		}
		
		else
		{
			System.out.println("Discount rate = 0");
		}
		
		{
			
			int total_bill_before_discount = number_of_packages * software_package_price;
			
			double discount_amount = (discount_rate/100) * total_bill_before_discount;
			
			double total_bill_amount_after_discount = total_bill_before_discount - discount_amount;
			
			System.out.println("Total Bill Amount (before discount) = $" + total_bill_before_discount );
			
			System.out.println("Amount of discount = $" + discount_amount);
			
			System.out.println("Total Bill Amount (after discount) = $" + total_bill_amount_after_discount );
			
		}
	

	}

}
