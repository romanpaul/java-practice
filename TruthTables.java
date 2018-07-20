/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roman
 */
public class TruthTables {
    
    public static void printTruthTableValue (boolean p, boolean q, String logicalOperation) {
     System.out.printf("%-3s %-3s %-7s\n", p, q, logicalOperation);
     if (p && q) {
         System.out.print(p + "\t" + q +"\t");
     } else {
         if (p !&& q) 
     }
     
    }
    
    public static void printTruthTable (String logicalOperation) {
        System.out.println("p q p " + logicalOperation + " q");
        System.out.println("-----------");
        printTruthTableValue(true,true,logicalOperation);
        printTruthTableValue(true,false,logicalOperation);
        printTruthTableValue(false,true,logicalOperation);
        printTruthTableValue(false,false,logicalOperation);
  }
    
    public static void main(String[] args) {
        printTruthTable("and");
        System.out.println();
        printTruthTable("or");
    }
    
}
