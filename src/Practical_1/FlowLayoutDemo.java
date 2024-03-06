// Java Flow Layout Demo using AWT
import java.awt.*;
public class FlowLayoutDemo extends Frame {
    public FlowLayoutDemo() {

        setLayout(new FlowLayout());
        add(new Button("Button 1"));
        add(new Button("Button 2"));
        add(new Button("Button 3"));
        add(new Button("Button 4"));
        add(new Button("Button 5"));
        add(new Button("Button 6"));
        add(new Button("Button 7"));
        add(new Button("Button 8"));
        add(new Button("Button 9"));
        add(new Button("Button 10"));
        setSize(300, 300);
        setVisible(true);
    }
    public static void main(String[] args) {
        new FlowLayoutDemo();
    }
}
