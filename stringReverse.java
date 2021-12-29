/* Zavier Jenkins
 * Assignment 1
 * CSI 213
 * October 4, 2017
 */

import javax.swing.JOptionPane;
import java.util.Scanner;

public class ZJDSHW1 {
  
  public static String reverse(String x,int y){
    if (y < 0) {
    return("");
    }else {
    return (x.charAt(y) + "" + reverse(x,y-1));
    } 
  }
  // Recursive method that reverses the user input.
  
  public static void run(String input){
    
   Scanner scan = new Scanner(System.in);
   System.out.println("Please Enter a String");
   input = scan.next();
     if(input.compareTo("done") == 0){
       System.out.println("Program has ended.");
        System.exit(0);
       // Ends program if user enters done.
     } else{
       System.out.println("Reversed Input: " + reverse(input,(input.length()-1)));
       run("");
       // Uses reverse method to print reversed input, then calls itself.
     }
   } 
   // Recursive method that checks the input and calls on method "reverse."
  
  public static void main(String [] args) {
   run("");
  }
  // Main method that calls on the "run" method.
} 
