/*
 Zavier Jenkins
 Assigment 4A
 Due Date: 
 ZJ497481
 */

import javax.swing.JOptionPane;
import java.io.*;

public class Assignment4ptA {
    
  public static void displayTemperature(int dayNum, int firstTemp) {
   // This is the method that does the weather formula
    int x = 0;
    
    try{
    PrintWriter writer = new PrintWriter("Blank.txt", "UTF-8");
    try{
    while (x < (dayNum/2)) {
      writer.println("" + (firstTemp - (2*x)));
        x = x +1;
    } 
    // first half of the formula (adding 2 to the initial temperature for half the period) 

   double y = ((dayNum/2));
   if (dayNum % 2 != 0){
    x = 4;
   } else{
   x = 3;
   }
    while (y < dayNum && y >= dayNum/2){
      writer.println("" + ((firstTemp-dayNum) + x));
      y = y + 1;
      x = x + 1;
    }
    // second half of the formula (subtracting 1 from the new temperature after half the period) 

   writer.close();
   
  } finally{System.out.println("finally block is always executed");}  
} catch (IOException e) {
        e.printStackTrace();
     }
  }
  
     public static void main(String [] args){
       // This is the main argument that calls the displaytemperature method
       
       BufferedReader br;
       
       int day1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of days"));
     // Ask user for the number of days in a period
     
     int temp1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the temperature on the first day."));
     // Ask user for the initial temperature
     
     displayTemperature((day1),(temp1));
     
      try {
     br = new BufferedReader(new FileReader("Blank.txt"));
     try {
       System.out.println("Day     Temp");
        String x;
        int iteration = 1;
        while ( (x = br.readLine()) != null) {
          String a = x;
          System.out.println(iteration + "     " + a);
          iteration = iteration + 1;
          //if (a < num){ end = end + 1;} 
          //else { break;}
        }
    }
    catch (IOException e) {
        e.printStackTrace();
     }
    
   }  
   // Bufferedreaader reads the test file line by line until the end of the file, then the integer in each line is compared to the given integer. Each time the integer in the file is less than the given integer, the variable end is increased by 1. 
   
   catch (FileNotFoundException e) {
    System.out.println(e);
    e.printStackTrace();
   }
     
  }
  
} 