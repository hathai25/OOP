package hust.soict.it2.lab02;

//Pham Huy Ha Thai - MSSV: 20204784
//BT 5.6

import java.util.Arrays;
import java.util.Scanner;

public class ArraySorter {
  //sort function - bubble sort
  static void Sort(int[] arr) {
      for (int i = 0; i < arr.length; i++) {
          for (int j = i+1; j < arr.length; j++) {
              if (arr[i] > arr[j]) {
                  int temp;
                  temp = arr[i];
                  arr[i] = arr[j];
                  arr[j] = temp;
              }
          }
      }
  }
  public static void main(String[] args) {
      int n, total = 0;
      Scanner keyboard = new Scanner(System.in);
      //get array input
      System.out.print("How many elements do you want to add? ");
      n = keyboard.nextInt();
      int arr[] = new int[n];
      System.out.println("Enter your array: ");
      for (int i = 0; i<n; i++) {
          arr[i] = keyboard.nextInt();
          total += arr[i];
      }
      keyboard.close();
      //print the array
      System.out.print("Your array is: " + Arrays.toString(arr));
      Sort(arr);
      //return the results
      System.out.print("\nSorted array is: " + Arrays.toString(arr));
      System.out.print("\nSum of your array is: " + total + "; Average of your array is: " + (float)(total)/(float)n);
  }
}