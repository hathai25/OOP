package hust.soict.it2.lab01;

//Pham Huy Ha Thai - MSSV: 20204784
//BT 2.2.3

import javax.swing.JOptionPane;
public class HelloNameDialog {
  public static void main(String[] args) {
      String result;
      result = JOptionPane.showInputDialog("Please enter your name:");
      JOptionPane.showMessageDialog(null, "Hi " + result + "!");
      System.exit(0);
  }
}