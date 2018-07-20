import java.util.Scanner;
public class GeneralUnitConversion {

  public static void convert(String from, String to, double factor) {
  double value;
  Scanner in = new Scanner(System.in);

  System.out.println("Please enter a value in " + to + " to convert to " + from + ": ");
  value = in.nextDouble();
  double result = (factor * value);
  System.out.printf("%.2f %s = %.2f %s\n", value, from, result, to);

}

  public static void main(String[] args) {
  String from;
  String to;
  String answer;
  double factor;
  double value;
  Scanner in = new Scanner(System.in);

  System.out.print("Please enter the name of the units you will convert from: ");
  from = in.nextLine();
  System.out.print("Please enter the name of the units you will convert to: ");
  to = in.nextLine();
  System.out.print("Please enter the conversion factor to convert from" + from + " to " + to + ": ");
  factor = in.nextDouble();
  System.out.print("Soon you will be prompted to enter a value to convert.");
  System.out.printf("Do you need to enter a value in the unit of " + to + " to convert to " + from + "? Type yes or no: ");
  answer = in.nextLine();
  in.nextLine();
  if(!answer.equals("no")){
  //run convert method to invert conversion
  convert(from, to, factor);
  }
  else{
  //ignore convert method
  System.out.print("Please enter a value in " + from + " to convert to " + to + ": ");
  value = in.nextDouble();
  double result = (1 / factor * value);
  System.out.printf("%.2f %s = %.2f %s\n", value, from, result, to);
  }

}
}