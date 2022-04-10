//Pham Huy Ha Thai - MSSV: 20204784 
//BT 5.7

import java.util.Scanner;

public class Matrix {
    public static void main(String[] arg) {
        Scanner keyboard = new Scanner(System.in);
        //get matrix size
        System.out.print("Enter the number of matrix row: ");
        int m = keyboard.nextInt();
        System.out.print("Enter the number of matrix column: ");
        int n = keyboard.nextInt();
        //initial 2 input matrices & sum matrix
        int[][] arr1 = new int[m][n];
        int[][] arr2 = new int[m][n];
        int[][] result = new int[m][n];
        //get matrix1 entries values
        System.out.println("Enter the first matrix: ");
        for (int i = 0; i<m; i++) {
            for (int j = 0; j<n; j++) {
                arr1[i][j] = keyboard.nextInt();
            }
        }
        //get matrix2 entries values
        System.out.println("Enter the second matrix: ");
        for (int i = 0; i<m; i++) {
            for (int j = 0; j<n; j++) {
                arr2[i][j] = keyboard.nextInt();
            }
        }
        keyboard.close();
        //add matrix 1 & 2 
        for (int i = 0; i<m; i++) {
            for (int j = 0; j<n; j++) {
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        //print result
        System.out.println("Sum of two matrices is: ");
        for (int i = 0 ; i < m ; i++ ) {
            for (int j = 0 ; j < n ; j++ )
            System.out.print(result[i][j]+" ");
            System.out.println(); 
        }
    }
}