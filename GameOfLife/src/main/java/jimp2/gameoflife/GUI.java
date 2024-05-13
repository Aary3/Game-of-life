/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jimp2.gameoflife;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author piotr-sosnowski
 */
public class GUI extends JFrame{
    
    final static int DEFAULTWIDTH = 1600;
    final static int DEFAULTHEIGHT = DEFAULTWIDTH-200;
    
    public GUI() {
        setTitle("Game Of Life");
        setSize(DEFAULTWIDTH, DEFAULTHEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setVisible(true);
    }
    
    public static void main(String[] args) {
        // Run the application
        SwingUtilities.invokeLater(() -> new GUI());
    }
}
