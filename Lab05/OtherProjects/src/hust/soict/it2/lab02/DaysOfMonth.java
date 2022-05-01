package hust.soict.it2.lab02;

//Pham Huy Ha Thai - MSSV: 20204784
//BT 5.5

import java.util.Scanner;

public class DaysOfMonth {
  //function to find and return days in a month
  static void ReturnDays(String monthString, int month, int year) {
      if (year % 4 == 0) {
          if (year % 100 == 0 && year % 400 != 0) {
              if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) System.out.print(monthString + " - " + year + " has 31 days");
              if (month == 4 || month == 6 || month == 9 || month == 11) System.out.print(monthString + " - " + year + " has 30 days");
              if (month == 2) System.out.print(monthString + " - " + year + " has 28 days");
          }
          else {
              if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) System.out.print(monthString + " - " + year + " has 31 days");
              if (month == 4 || month == 6 || month == 9 || month == 11) System.out.print(monthString + " - " + year + " has 30 days");
              if (month == 2) System.out.print(monthString + " - " + year + " has 29 days");
          }
      }   else {
          if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) System.out.print(monthString + " - " + year + " has 31 days");
          if (month == 4 || month == 6 || month == 9 || month == 11) System.out.print(monthString + " - " + year + " has 30 days");
          if (month == 2) System.out.print(monthString + " - " + year + " has 28 days");
      }
  }
  public static void main(String[] args) {
      String[] months = {"January", "February", "March", "April", "May", "June", 
      "July", "August", "September", "October", "November", "December"};
      String month;
      int year;
      Scanner keyboard = new Scanner(System.in);
      //get month
      while(true) {
          System.out.print("Enter month: ");
          String inputMonth = keyboard.nextLine();
          int count = 0;
          for (int i = 0; i < months.length; i++) {
              if (inputMonth.equals(months[i]) || inputMonth.equals(months[i].substring(0, 3)) || inputMonth.equals(months[i].substring(0, 3) + ".") || inputMonth.equals(String.valueOf(i+1))) {
                  count++;
              }
          }   
          if (count == 0) {
              System.out.println("Invalid month! Try again!");
              continue;
          }
          month = inputMonth;
          break;
      }
      //get year
      while(true) {
          System.out.print("Enter year: ");
          String inputYear = keyboard.nextLine();
          try {
              year = Integer.parseInt(inputYear);                
              if (year >= 0) break;
          } catch (NumberFormatException ex) {
              System.out.println("Invalid year! Try again!");
          }
          
      }
      keyboard.close();
      //find input
      for (int i = 0; i < months.length; i++) {
          if (month.equals(months[i]) || month.equals(months[i].substring(0, 3)) || month.equals(months[i].substring(0, 3) + ".") || month.equals(String.valueOf(i+1))) {
              ReturnDays(month, i+1, year);
          }
      }
  }
}