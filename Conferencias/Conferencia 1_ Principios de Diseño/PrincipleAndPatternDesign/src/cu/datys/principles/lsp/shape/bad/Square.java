package cu.datys.principles.lsp.shape.bad;

/**
 * Created by alexander.escalona on 25/01/2018.
 */
public class Square extends Rectangle {
    public Square(int width) {
        super(width, width);
    }

    @Override
    public void setWidth(int width) {
        this.width = this.height = width;
    }

    @Override
    public void setHeight(int height) {
        this.width = this.height = width;
    }
}
