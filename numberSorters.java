/*Zavier Jenkins
Assignment 2
 CSI 213
October 4, 2017
*/
 

import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.Random;


public class ZJDSHW2 {
  public static int p = 0;
  public static int q = 0;
  public static int r = 0;
  // Record numbers for average comparison count
  
  public static int randInt(int min, int max) {
    Random poop = new Random();
    int randomNum = poop.nextInt((max - min) + 1) + min;
    return randomNum;
    // Random Number Generator Source: https://stackoverflow.com/questions/363681/how-do-i-generate-random-integers-within-a-specific-range-in-java
}
  
  static int insertionSort(int array[], int n){
    
   int i;
   int key;
   int x;
   int ISC = 0;
   
   for (i = 1; i < n; i++)
     ISC = ISC + 1;
   {
       key = array[i];
       x = i-1;
       while (x >= 0 && array[x] > key)
       {
           array[x+1] = array[x];
           x = x-1;
       }
       array[x+1] = key;
   }
   return(ISC);
}
 //Code for insertion sort + the comparison count
  
  static int bubbleSort(int[] array) {  
    int x = array.length;  
    int temp = 0; 
    int BSC = 0;
    
    for(int i=0; i < x; i++){  
      for(int y=1; y < (x-i); y++){ 
        BSC = BSC + 1;
        if(array[y-1] > array[y]){   
          temp = array[y-1];  
          array[y-1] = array[y];  
          array[y] = temp;  
          //swaps the elements
        }  
      }  
    }  
    return(BSC);
  }  
  //Code for Bubble sort + the comparison count
  
  public static int quickSort(int array[], int start, int end)  {
    int QSC = 0;
    int i = start, x = end;
    int temp;
    int pivot = array[(start + end) / 2];
    
    //partition
    while (i <= x) 
    {
      while (array[i] < pivot)
        i++;
      while (array[x] > pivot)
        x--;
      if (i <= x) 
      {
        //swap
        temp = array[i];
        array[i] = array[x];
        array[x] = temp;
        i++;
        x--;
        QSC = QSC + 1;
      }
    }
    if (start < x)
      quickSort(array, start, x);
    if (i < end)  
      quickSort(array, i, end);
    
    return(QSC);
  }
  // Quick Sort + the comparison count
  
  static void randomArray(int arraylength) {  
    int arraySwitch = 0;
    int array1[]= new int[arraylength];
    int fixedArray[] = new int[arraylength];
    int x = 0;
    int y = 0;
    int z = 0;
    // crea
    System.out.print("Original Array: ");
    while (arraySwitch < arraylength){
        array1[arraySwitch] = randInt(0,99);
        System.out.print(array1[arraySwitch] + " ");
        arraySwitch = arraySwitch + 1;
      }
    
    for(int i=0; i<arraylength; i++){
      fixedArray[i]=array1[i];
    }
    
    x = bubbleSort(fixedArray);
    arraySwitch = 0;
    
    System.out.print("Sorted Array: ");
    while (arraySwitch < arraylength){
        System.out.print(fixedArray[arraySwitch] + " ");
        arraySwitch = arraySwitch + 1;
      }
    System.out.print( "\n");
    System.out.println("Bubble Sort Comparisons:" + x);
    bubbleCount(x);
    // Calls Bubble Sort function and counts its comparisons to report it
    
    for(int i=0; i<arraylength; i++){
      fixedArray[i]=array1[i];
    } 
    
    y = insertionSort(fixedArray, (arraylength-1));
    
    System.out.println("Insertion Sort Comparisons:" + y);
    insertionCount(y);
    // Calls Insertion Sort function and counts its comparisons to report it

    for(int i=0; i<arraylength; i++){
      fixedArray[i]=array1[i];
    } 
    
    z = quickSort(fixedArray,0,arraylength-1);
    
    System.out.println("Quick Sort Comparisons:" + z);
    System.out.print( "\n");
    quickCount(z);
    // Calls Quick Sort function and counts its comparisons to report it
    
  }
  // Creation of random array and calls for each algorithm to sort it
  
  
  public  static void quickCount(int n){p = p + n;}
  public static void bubbleCount(int n){q = q + n;}
  public static void insertionCount(int n){r = r + n;}
  // Adds to the comparison counts that average the counts per set of 10 
  
  public static void main(String [] args) {
    int i1 = 0;   
    int sortAVG = 0;
    
    while (i1 < 10){  
      i1 = i1 + 1;
      randomArray(10);
    } 
    System.out.println("Average Quick Sort Comparison" + p/10);
    System.out.println("Average Bubble Sort Comparison" + q/10);
    System.out.println("Average Insertion Count Comparison" + r/10);
    
    p = 0;
    q = 0;
    r = 0;
    
    i1 = 0;
    while (i1 < 10){  
      i1 = i1 + 1;
      randomArray(100);
    } 
    System.out.println("Average Quick Sort Comparison" + p/10);
    System.out.println("Average Bubble Sort Comparison" + q/10);
    System.out.println("Average Insertion Count Comparison" + r/10);
    
    p = 0;
    q = 0;
    r = 0;
    
    i1 = 0;
    while (i1 < 10){  
      i1 = i1 + 1;
      randomArray(1000);
    } 
    System.out.println("Average Quick Sort Comparison: " + p/10);
    System.out.println("Average Bubble Sort Comparison: " + q/10);
    System.out.println("Average Insertion Count Comparison: " + r/10);
    
    p = 0;
    q = 0;
    r = 0;
  }
  //intializes creation of array by specifying length of array and the amount of times to create an array and sort it.
  
} 
