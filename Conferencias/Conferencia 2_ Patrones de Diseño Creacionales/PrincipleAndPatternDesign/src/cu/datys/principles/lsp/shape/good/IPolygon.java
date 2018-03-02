package cu.datys.principles.lsp.shape.good;

/**
 * Created by alexander.escalona on 25/01/2018.
 */
public interface IPolygon {
    int getNumberOfSides();
    int getSideLength(int side);
    int area();
}
