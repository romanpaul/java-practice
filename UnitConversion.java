/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roman
 */
import java.util.Scanner;
public class UnitConversion {
    public static void main(String[] args) {
        String from;
        String to;
        double factor;
        double value;
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the name of the units you will convert from:");
        from = in.nextLine();
        System.out.print("Please enter the name of the units you will convert to:");
        to = in.nextLine();
        System.out.print("Please enter the conversion factor to convert from " + from + " to " + to + ":");
        factor = in.nextDouble();
        System.out.print("Please enter a value in " + from + " to convert to " + to + ":");
        value = in.nextDouble();

        final double result = (value * factor);
        System.out.printf("%.2f %s = %.2f %s\n", value, from, result, to);

}
}
