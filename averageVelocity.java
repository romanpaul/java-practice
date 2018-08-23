import java.util.Scanner;

public class averageVelocity {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double x1;
		double x2;
		double t1;
		double t2;
		
		// ask for X1
		System.out.print("Please enter the first point: ");
		x1 = in.nextDouble();
		
		// ask for X2
		System.out.print("Please enter the second point: ");
		x2 = in.nextDouble();
		
		// ask for T1
		System.out.print("Please enter the first time interval parameter: ");
		t1 = in.nextDouble();
		
		// ask for T2
		System.out.print("Please enter the second time interval parameter: ");
		t2 = in.nextDouble();
		
		double velocity = (x2 - x1) / (t2 - t1);
		
		System.out.print("The average velocity is " + velocity);
	}

}
