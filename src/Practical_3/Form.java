// Program to design a form using basic swing components and use of tabbed panes and scroll panes in Swing.
package Practical_3;

import javax.swing.*;

public class Form extends JFrame{
    public Form(){
        setTitle("Form");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setBounds(0, 0, 400, 400);
        add(tabbedPane);

        JPanel personal = new JPanel();
        personal.setLayout(null);
        tabbedPane.addTab("Personal", personal);

        JLabel nameLabel = new JLabel("Name");
        nameLabel.setBounds(10, 10, 100, 30);
        personal.add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(120, 10, 200, 30);
        personal.add(nameField);

        JLabel ageLabel = new JLabel("Age");
        ageLabel.setBounds(10, 50, 100, 30);
        personal.add(ageLabel);

        JTextField ageField = new JTextField();
        ageField.setBounds(120, 50, 200, 30);
        personal.add(ageField);

        JPanel address = new JPanel();
        address.setLayout(null);
        tabbedPane.addTab("Address", address);

        JLabel streetLabel = new JLabel("Street");
        streetLabel.setBounds(10, 10, 100, 30);
        address.add(streetLabel);

        JTextField streetField = new JTextField();
        streetField.setBounds(120, 10, 200, 30);
        address.add(streetField);

        JLabel cityLabel = new JLabel("City");
        cityLabel.setBounds(10, 50, 100, 30);
        address.add(cityLabel);

        JTextField cityField = new JTextField();
        cityField.setBounds(120, 50, 200, 30);
        address.add(cityField);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(0, 0, 400, 400);
        scrollPane.setViewportView(tabbedPane);
        add(scrollPane);
    }

    public static void main(String[] args) {
        Form form = new Form();
        form.setVisible(true);
    }
}
