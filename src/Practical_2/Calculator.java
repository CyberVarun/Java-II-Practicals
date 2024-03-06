// Calculator using AWT
package Practical_2;

import java.awt.*;

public class Calculator extends Frame {
    public Calculator(){
        super("Calculator");
        setLayout(new BorderLayout());
        add(new TextField(), BorderLayout.NORTH);
        Panel p = new Panel();
        p.setLayout(new GridLayout(4, 4));
        String[] labels = {"7", "8", "9", "+",
                "4", "5", "6", "-",
                "1", "2", "3", "*",
                "0", ".", "=", "/"};
        for (String label : labels) {
            p.add(new Button(label));
        }
        add(p, BorderLayout.CENTER);
        setSize(300, 300);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Calculator();
    }
}
