package cu.datys.principles.lsp.shape.good;

/**
 * Created by alexander.escalona on 25/01/2018.
 */
public class Rectangle extends Quadrilateral{
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getSideLength(int side){
        return (side & 1) == 0 ? width : height;
    }
    public int area(){
        return width * height;
    }
}
