import java.util.Scanner;

public class caloriesBurned {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double cycling;
		double jogging;
		double swimming;
		
		// Ask which activity was performed
		System.out.print("How many hours did you spend cycling today? \n");
		double cycleTime = in.nextDouble();
		
		System.out.print("How many hours did you spend jogging today? \n");
		double jogTime = in.nextDouble();
		
		System.out.print("How many hours did you spend swimming today? \n");
		double swimTime = in.nextDouble();
		
		cycling = cycleTime * 200;
		jogging = jogTime * 475;
		swimming = swimTime * 275;
		
		double totalCal = cycling + jogging + swimming;
		
		// Return calories and number of pounds burned
		
		System.out.printf("You burned " + totalCal + " calories and %.2f pounds! %n", totalCal / 3500);

	}

}
