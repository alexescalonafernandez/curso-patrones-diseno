package cu.datys.patterns.gof.behavioral.visitor.component;

import java.awt.*;

/**
 * Created by alexander.escalona on 27/10/2017.
 */
public class DrawVisitor implements IVisitor {
    private final Graphics g;

    public DrawVisitor(Graphics g) {
        this.g = g;
    }

    public void visit(Line line) {
        g.drawLine(line.getX1(), line.getY1(), line.getX2(), line.getY2());
    }

    public void visit(Rectangle rectangle) {
        g.drawRect(rectangle.getX(), rectangle.getY(), rectangle.getWidth(), rectangle.getHeight());
    }

    public void visit(Container container) {
        g.translate(container.getX(), container.getY());
    }
}
