/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tableanalyzer;

/**
 *
 * @author Roman
 */
import java.util.Scanner;

public class TableAnalyzer {

    public static double[] readRow(int numColumns) {
        Scanner in = new Scanner(System.in);
        int count = 0;

        System.out.print("How many columns will your table contain? ");
        numColumns = in.nextInt();
        double[] columnArray = new double[numColumns];
        System.out.print("Please enter a numbers followed by Return: ");

        for (int i = 0; i < numColumns; ++i) {
            columnArray[i] = in.nextDouble();
            ++count;
        }
        in.nextLine();
        return columnArray;
    }

    public static int analyzeData() {
        Scanner in = new Scanner(System.in);
        boolean okay;
        int count = 0;
        int sum = 0;
        do {
            readRow(count);
            System.out.print("Will you enter another row? (yes/no) ");
            if (in.next().equals("yes")) {
                okay = true;
                in.nextLine();
                sum += count;
            } else {
                okay = false;
                System.out.print("You entered " + count + " rows of data\n");
                System.out.print("The mean is " + sum / count + " and variance ");
            }
        } while (okay);
        return count;
    }

    public static void main(String[] args) {
        analyzeData();
    }

}
