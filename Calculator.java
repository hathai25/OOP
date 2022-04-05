//Pham Huy Ha Thai - MSSV: 20204784

import javax.swing.JOptionPane;
public class Calculator {

    public static void main(String[] args)
    {
        String strNum1, strNum2;
        double sum, difference, product, quotient;
        //input first number
        strNum1 = JOptionPane.showInputDialog(null, 
        "Please input the first number: ", "Input the first number",
        JOptionPane.INFORMATION_MESSAGE);
        //input second number
        strNum2 = JOptionPane.showInputDialog(null, 
        "Please input the second number: ", "Input the second number",
        JOptionPane.INFORMATION_MESSAGE);
        //Calculate
        sum = Double.parseDouble(strNum1) + Double.parseDouble(strNum2);
        difference = Double.parseDouble(strNum1) - Double.parseDouble(strNum2);
        product = Double.parseDouble(strNum1) * Double.parseDouble(strNum2);
        quotient = Double.parseDouble(strNum1) / Double.parseDouble(strNum2);
        //Return results
        JOptionPane.showMessageDialog(null, sum, "Sum", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, difference, "Difference", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, product, "Product", JOptionPane.INFORMATION_MESSAGE);
        if (Double.parseDouble(strNum2) == 0) {
            JOptionPane.showMessageDialog(null, "Can't divide with zero!", "Quotient", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, quotient, "Quotient", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
