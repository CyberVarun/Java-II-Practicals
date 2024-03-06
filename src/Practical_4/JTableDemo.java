// Java program to demonstrate JTable
package Practical_4;

import javax.swing.*;

public class JTableDemo extends JFrame {
    public JTableDemo() {
        // create a table
        String[][] data = {
                {"Sanyog Jadhav", "2106076", "CSE"},
                {"Varun Jagtap", "2106082", "CSE"},
                {"Atharva Kadam", "2106086", "CSE"},
                {"Vedant Kale", "2106090", "CSE"},
                {"Vishwajeet Kamble", "2106091", "CSE"},
                {"Sahil Kapse", "2106094", "CSE"},
        };
        String[] columnNames = {"Name", "Roll Number", "Department"};
        JTable table = new JTable(data, columnNames);

        // add the table to the frame
        add(new JScrollPane(table));
    }

    public static void main(String[] args) {
        JTableDemo frame = new JTableDemo();
        frame.setTitle("JTable Demo");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
