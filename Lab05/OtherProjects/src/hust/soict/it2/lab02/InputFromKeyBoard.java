package hust.soict.it2.lab02;

//Pham Huy Ha Thai - MSSV:20204784
//BT 5.2

import java.util.Scanner;

public class InputFromKeyBoard {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What's your name?");
		String strName = keyboard.nextLine();
		System.out.println("How old are you?");
		int iAge = keyboard.nextInt();
		System.out.println("How tall are you (m)?");
		double dHeight = keyboard.nextDouble();
		
		System.out.println("Mrs/Ms. " + strName + ", " + iAge + " year old. "
				+ "Your height is " + dHeight + ".");
	}
}