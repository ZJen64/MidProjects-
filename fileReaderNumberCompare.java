/*
 Zavier Jenkins
 Assigment 3B
 Due Date: March 30, 2017
 ZJ497481
 */

import javax.swing.JOptionPane;
import java.io.*;

public class Assignment3ptB {
  
  public static void main(String [] args) {
   
   String file = JOptionPane.showInputDialog("Enter text file name.");
   //Name of file is TestText.txt
   int num = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer.")); 
   int end = 0;
   // Creates option panes for the user to enter name of the file and the desired integer. Also creates the variable end
   
   BufferedReader br;
   // introduces new bufferedreader to read the desired file
   
   try {
     br = new BufferedReader(new FileReader(file + ".txt"));
     try {
        String x;
        while ( (x = br.readLine()) != null) {
          int a = Integer.parseInt(x);
          if (a < num){ end = end + 1;} 
          else { break;}
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
   // Reports error when the given file is not found.
   
    System.out.println("The number to check: " + num);
    System.out.println("There are "+ end + " numbers below " + num);
    // prints out what number was given and how many numbers in the file are less than the given number 
  } 

}