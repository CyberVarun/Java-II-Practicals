// Java program to demonstrate JTree
package Practical_4;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTreeDemo extends JFrame {
    public JTreeDemo(){
        // create a root node
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");

        // create a tree node
        DefaultMutableTreeNode node1 = new DefaultMutableTreeNode("Node 1");
        DefaultMutableTreeNode node2 = new DefaultMutableTreeNode("Node 2");
        DefaultMutableTreeNode node3 = new DefaultMutableTreeNode("Node 3");

        // add the tree node to the root node
        root.add(node1);
        root.add(node2);
        root.add(node3);

        // create a tree
        JTree tree = new JTree(root);

        // add the tree to the frame
        add(tree);
    }

    public static void main(String[] args) {
        JTreeDemo frame = new JTreeDemo();
        frame.setTitle("JTree Demo");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
