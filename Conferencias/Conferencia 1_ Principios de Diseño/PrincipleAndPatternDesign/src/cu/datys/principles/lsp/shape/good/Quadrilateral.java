package cu.datys.principles.lsp.shape.good;

/**
 * Created by alexander.escalona on 25/01/2018.
 */
public abstract class Quadrilateral implements IPolygon{
    @Override
    public int getNumberOfSides() {
        return 4;
    }
}
