//Pham Huy Ha Thai - MSSV: 20204784

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.lang.Math;

public class Equation {
    static void firstDegreeEquation() {
        double a, b, x;
        //Layout
        JTextField aField = new JTextField(2);
        JTextField bField = new JTextField(2);
        //add Layout
        JPanel inputTable = new JPanel();
        inputTable.add(aField);
        inputTable.add(new JLabel("x + "));
        inputTable.add(bField);
        inputTable.add(new JLabel(" = 0"));
        //get input
        JOptionPane.showConfirmDialog(null, inputTable, "Enter the values", JOptionPane.OK_CANCEL_OPTION);
        a = Double.parseDouble(aField.getText());
        b = Double.parseDouble(bField.getText());
        //calculate
        x = - b / a;
        if (a == 0) {
            JOptionPane.showMessageDialog(null, "The equation has no result!", "Result", JOptionPane.INFORMATION_MESSAGE);
        }   else {
            JOptionPane.showMessageDialog(null, "The equation has a unique solution: x = " + x, "Solution", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    static void linearSystem() {
        String a11, a12, a21, a22, b1, b2;
        double x1, x2, D, D1, D2;
        //Input Layout
        JTextField a11Field = new JTextField(2);
        JTextField a12Field = new JTextField(2);
        JTextField a21Field = new JTextField(2);
        JTextField a22Field = new JTextField(2);
        JTextField b1Field = new JTextField(2);
        JTextField b2Field = new JTextField(2);
        //add Layout
        JPanel inputTable = new JPanel();
        inputTable.add(a11Field);
        inputTable.add(new JLabel("x1 +"));
        inputTable.add(a12Field);
        inputTable.add(new JLabel("x2"));
        inputTable.add(new JLabel(" = "));
        inputTable.add(b1Field);
        inputTable.add(new JLabel(";"));
        inputTable.add(a21Field);
        inputTable.add(new JLabel("x1 +"));
        inputTable.add(a22Field);
        inputTable.add(new JLabel("x2"));
        inputTable.add(new JLabel(" = "));
        inputTable.add(b2Field);
        //Input
        JOptionPane.showConfirmDialog(null, inputTable, "Enter the values", JOptionPane.OK_CANCEL_OPTION);
        a11 = a11Field.getText();
        a12 = a12Field.getText();
        a21 = a21Field.getText();
        a22 = a22Field.getText();
        b1 = b1Field.getText();
        b2 = b2Field.getText();
        D = Double.parseDouble(a11)*Double.parseDouble(a22) - Double.parseDouble(a21)*Double.parseDouble(a12);
        D1 = Double.parseDouble(b1)*Double.parseDouble(a22) - Double.parseDouble(b2)*Double.parseDouble(a12);
        D2 = Double.parseDouble(a11)*Double.parseDouble(b2) - Double.parseDouble(a21)*Double.parseDouble(b1);
        //Logic
        if (D == 0) {
            if (D == D1 && D == D2 ) JOptionPane.showMessageDialog(null, "Infinite solutions!", "Result", JOptionPane.INFORMATION_MESSAGE);
            else JOptionPane.showMessageDialog(null, "No solution!", "Result", JOptionPane.INFORMATION_MESSAGE);
        }   else {
            x1 = D1/D;
            x2 = D2/D;
            JOptionPane.showMessageDialog(null, "x1 = " + x1 + "; x2 = " + x2, "Result", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    static void secondDegreeEquation() {
        double a, b, c, delta, x1, x2, x;
        //Layout
        JTextField aField = new JTextField(2);
        JTextField bField = new JTextField(2);
        JTextField cField = new JTextField(2);
        //add Layout
        JPanel inputTable = new JPanel();
        inputTable.add(aField);
        inputTable.add(new JLabel("x^2 + "));
        inputTable.add(bField);
        inputTable.add(new JLabel("x + "));
        inputTable.add(cField);
        inputTable.add(new JLabel(" = 0"));
        // get input
        do {
            JOptionPane.showConfirmDialog(null, inputTable, "Enter the values", JOptionPane.OK_CANCEL_OPTION);
            a = Double.parseDouble(aField.getText());
            b = Double.parseDouble(bField.getText());
            c = Double.parseDouble(cField.getText());
            if (a == 0) JOptionPane.showMessageDialog(null, "Not a valid second-degree equation");
        } while(a == 0);
        
        delta = b*b - 4*a*c;
        if (delta == 0) {
            x = - b / (2*a);
            JOptionPane.showMessageDialog(null, "The equation has double root: x = " + x, "Result", JOptionPane.INFORMATION_MESSAGE);
        }   else if (delta > 0) {
                x1 = (-b + Math.sqrt(delta)) / (2*a);
                x2 = (-b - Math.sqrt(delta)) / (2*a);
                JOptionPane.showMessageDialog(null, "The equation has two distinct roots: x1 = " + x1 + ", x2 = " + x2, "Result", JOptionPane.INFORMATION_MESSAGE);
        }   else {
                JOptionPane.showMessageDialog(null, "The equation has no solution", "Result", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public static void main(String[] args) {
        String options[] = {"First Degree Equation", "Two variables first degree equations", "Second Degree Equation"};
        int x = JOptionPane.showOptionDialog(null, "Equation Solver", "Choose the equation you want to solve: ", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        if (x == 0) {
            firstDegreeEquation();
        }   else if (x == 1) {
            linearSystem();
        }   else if (x == 2) {
            secondDegreeEquation();
        }
    }
}