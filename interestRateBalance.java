import java.util.Scanner;

public class interestRateBalance {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("What is your principle balance? \n");
		double principle = in.nextDouble();
		
		System.out.print("What is your interest rate? \n");
		double interest = in.nextDouble();
		
		System.out.print("How many years from now would you like to see your balance? \n");
		double years = in.nextDouble();
		
		double futureBalance = principle * Math.pow(1 + interest, years);
		
		System.out.printf("If your principle stays the same, in " + years + " years you will have a balance of %.2f dollars", futureBalance);

	}

}
