package cu.datys.patterns.gof.behavioral.visitor.component;

/**
 * Created by alexander.escalona on 27/10/2017.
 */
public interface IVisitor {
    void visit(Line line);
    void visit(Rectangle rectangle);
    void visit(Container container);
}
