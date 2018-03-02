/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cu.datys.patterns.gof.structural.composite.component;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alexander.escalona
 */
public class Container implements IComposite{
    private final List<IComponent> childs;
    private final int x, y;
    
    public Container(int x, int y) {
        this.x = x;
        this.y = y;
        childs = new ArrayList<IComponent>();
    }
    

    public boolean add(IComponent child) {
        if(!childs.contains(child))
            return childs.add(child);
        return false;
    }

    public boolean remove(IComponent child) {
        return childs.remove(child);
    }

    public void draw(Graphics g) {
        g.translate(x, y);
        for(IComponent c : childs)
            c.draw(g);
    }
    
}
