/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cu.datys.patterns.gof.structural.composite.component;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author alexander.escalona
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final Container container = new Container(10, 10);
        Line line = new Line(0, 0, 50, 50);
        Rectangle r = new Rectangle(20, 20, 30, 30);
        container.add(line);
        container.add(r);
        
        final JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(){
            @Override
            public void paint(Graphics g) {
                super.paint(g); //To change body of generated methods, choose Tools | Templates.
                container.draw(g);
            }
            
        };
        
        panel.setPreferredSize(new Dimension(200, 200));
        frame.add(panel);
        frame.setResizable(false);
        frame.pack();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frame.setVisible(true);
            }
        });
    }
    
}
