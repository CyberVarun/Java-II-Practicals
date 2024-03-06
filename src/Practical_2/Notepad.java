// Notepad using Java AWT Menubar
package Practical_2;

import java.awt.*;
public class Notepad extends Frame{
    public Notepad(){
        setTitle("Notepad");
        setSize(500, 500);
        setVisible(true);
        MenuBar mb = new MenuBar();
        setMenuBar(mb);
        Menu file = new Menu("File");
        MenuItem mi1 = new MenuItem("New");
        MenuItem mi2 = new MenuItem("Open");
        MenuItem mi3 = new MenuItem("Save");
        MenuItem mi4 = new MenuItem("Exit");
        file.add(mi1);
        file.add(mi2);
        file.add(mi3);
        file.add(mi4);
        mb.add(file);
        Menu edit = new Menu("Edit");
        MenuItem mi5 = new MenuItem("Cut");
        MenuItem mi6 = new MenuItem("Copy");
        MenuItem mi7 = new MenuItem("Paste");
        edit.add(mi5);
        edit.add(mi6);
        edit.add(mi7);
        mb.add(edit);
        Menu view = new Menu("View");
        MenuItem mi8 = new MenuItem("Zoom In");
        MenuItem mi9 = new MenuItem("Zoom Out");
        view.add(mi8);
        view.add(mi9);
        mb.add(view);
        Menu help = new Menu("Help");
        MenuItem mi10 = new MenuItem("About");
        help.add(mi10);
        mb.add(help);
    }

    public static void main(String[] args) {
        new Notepad();
    }
}
