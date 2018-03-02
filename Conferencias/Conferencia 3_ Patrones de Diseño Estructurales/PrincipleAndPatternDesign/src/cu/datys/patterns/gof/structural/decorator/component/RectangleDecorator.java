/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cu.datys.patterns.gof.structural.decorator.component;

import java.awt.Graphics;

/**
 *
 * @author alexander.escalona
 */
public class RectangleDecorator implements IComponent{
    private Rectangle rectangle;
    private boolean fill;
    
    public RectangleDecorator(Rectangle rectangle, boolean fill) {
        this.rectangle = rectangle;
        this.fill = fill;
    }

    public void draw(Graphics g) {
        rectangle.draw(g);
        if(fill)
            g.fillRect(rectangle.getX(), rectangle.getY(), 
                rectangle.getWidth(), rectangle.getHeight());
    }
    
}
