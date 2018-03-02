package cu.datys.principles.ocp.drawing.bad;

/**
 * Created by alexander.escalona on 25/01/2018.
 */
public class GraphicEditor {
    public void drawShape(IShape shape){
        if(shape instanceof Circle)
            drawCircle((Circle) shape);
        else if(shape instanceof Rectangle)
            drawRectangle((Rectangle)shape);
    }

    /*
	 * Draw circle
	 */
    private void drawCircle(Circle r) {
        System.out.println("Drawing Circle");
    }

    /*
     * Draw rectangle
     */
    private void drawRectangle(Rectangle r) {
        System.out.println("Drawing Rectangle");
    }
}
