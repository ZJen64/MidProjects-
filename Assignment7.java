/*
Zavier Jenkins
Net ID: ZJ497481
Due Date: May 8, 2017
*/

import javax.swing.JOptionPane;

public class Assignment7{
  public static void main(String args []){
    
    int i = 0;
    int p = 0;
    
    /*
     int[][] j = new int [2][2];
     j[1][1] = 10;
     
     System.out.println(j[0][1]);
    */
    
    matrix mat = new matrix();
    //new instance of matrix
    
   mat.setM(Integer.parseInt(JOptionPane.showInputDialog("Enter first number of matrix")));
   mat.setN(Integer.parseInt(JOptionPane.showInputDialog("Enter second number of matrix")));
   
   mat.setMatNum(1,1,90);
   
   System.out.println(mat.getMatNum(1,1));
   
    /*
    while (p < mat.getN()){
      while( i < mat.getM()){
        mat.setMatNum(p,i,(Integer.parseInt(JOptionPane.showInputDialog("Enter number for matrix"))));
        i = i + 1;
      }
      i = 0;
      p = p + 1;
    }
 */   
  }
}
