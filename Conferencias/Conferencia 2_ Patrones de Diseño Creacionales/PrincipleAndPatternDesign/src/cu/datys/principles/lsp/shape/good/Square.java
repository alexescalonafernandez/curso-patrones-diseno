package cu.datys.principles.lsp.shape.good;

/**
 * Created by alexander.escalona on 25/01/2018.
 */
public class Square extends Quadrilateral{
    private int width;

    public Square(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int getSideLength(int side) {
        return width;
    }

    @Override
    public int area() {
        return width * width;
    }
}
