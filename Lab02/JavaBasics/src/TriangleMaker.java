//Pham Huy Ha Thai - MSSV: 20204784
//BT 5.4

import java.util.Scanner;

public class TriangleMaker {
    //print each line
    static void starLine(int n, int count) {
        String star = "*";
        String space = " ".repeat((2*n-1)/2);
        String starLine = star.repeat(2*n-(2*count-1));
        System.out.println(space + starLine);
    }
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        //get input
        System.out.println("How tall do you want the star to be?");
        int height = keyboard.nextInt();
        keyboard.close();
        int count = height;
        //print the triangle
        for (int i = height; i>0; i--) {
            starLine(i, count);
            count -= 2;
        }
    }
}