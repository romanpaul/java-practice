import java.util.Scanner;

public class tipCalculator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double tipAmount;
		
		// Ask for amount of the bill
		System.out.print("Please enter the amount of the bill: ");
		double bill = in.nextInt();
		
		// Ask for percentage to tip
		System.out.print("Please enter the percentage you would like to tip (numbers only): ");
		double tipPercentage = in.nextInt();
		
		tipAmount = (bill * tipPercentage / 100);
		
		// Return amount of tip and total
		System.out.print("Tip $" + tipAmount + " for a total of $" + (tipAmount + bill));

	}

}
