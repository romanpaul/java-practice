/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celsius2fahrenheit;

/**
 *
 * @author Roman
 */

import java.util.Scanner;

public class Celsius2Fahrenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner user_input = new Scanner( System.in );
        
        double celsius, fahrenheit;
        System.out.print("Enter a temperature in Celsius: ");
        celsius = user_input.nextDouble();
        fahrenheit = 32.0 + (celsius * 9.0 / 5.0);
        System.out.printf("%.1f C = %.1f F", celsius, fahrenheit); 
    }
    
}
