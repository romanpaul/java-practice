/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roman
 */
public class tempChart {
    
    public static void degreeHeader (String cTitle, String fTitle) {
  System.out.println(cTitle + fTitle);
  }
   
    public static void outputDegreesF (double degreesC) {
     double fahrenheit = 32.0 + (degreesC * 9.0 / 5.0);
     System.out.printf("%.1f %.1f\n", degreesC, fahrenheit);
    }

  public static void main(String[] args) {
   degreeHeader("Degrees (C)", " Degrees (F)\n");
   outputDegreesF(0.0);
   outputDegreesF(5.0);
   outputDegreesF(10.0);
   outputDegreesF(15.0);
   outputDegreesF(20.0);
   outputDegreesF(25.0);
   outputDegreesF(30.0);
   outputDegreesF(35.0);
   outputDegreesF(40.0);
   outputDegreesF(45.0);
   outputDegreesF(50.0);
   outputDegreesF(55.0);
   outputDegreesF(60.0);
   outputDegreesF(65.0);
   outputDegreesF(70.0);
   outputDegreesF(75.0);
   outputDegreesF(80.0);
   outputDegreesF(85.0);
   outputDegreesF(90.0);
   outputDegreesF(95.0);
   outputDegreesF(100.0);
   outputDegreesF(105.0);
   outputDegreesF(110.0);
   outputDegreesF(115.0);
   outputDegreesF(120.0);
   outputDegreesF(125.0);

 }
  

    
}
