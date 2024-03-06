// Java Card Layout Demo using AWT
package Practical_1;

import java.awt.*;
public class CardLayoutDemo extends Frame {
    public CardLayoutDemo(){
        CardLayout cardLayout = new CardLayout();
        setLayout(cardLayout);
        Button b1 = new Button("First");
        Button b2 = new Button("Second");
        Button b3 = new Button("Third");
        add(b1, "First");
        add(b2, "Second");
        add(b3, "Third");
        cardLayout.show(this, "First");
        setSize(300, 300);
        setVisible(true);
    }
    public static void main(String[] args) {
        new CardLayoutDemo();
    }
}
