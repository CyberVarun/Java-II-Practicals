// Java Grid Layout Demo using AWT
package Practical_1;

import java.awt.*;
public class GridLayoutDemo extends Frame {
    public GridLayoutDemo(){
        setLayout(new GridLayout(3, 3));
        Button b1 = new Button("1");
        Button b2 = new Button("2");
        Button b3 = new Button("3");
        Button b4 = new Button("4");
        Button b5 = new Button("5");
        Button b6 = new Button("6");
        Button b7 = new Button("7");
        Button b8 = new Button("8");
        Button b9 = new Button("9");
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        setSize(500, 500);
        setVisible(true);
    }
    public static void main(String[] args) {
        new GridLayoutDemo();
    }
}
