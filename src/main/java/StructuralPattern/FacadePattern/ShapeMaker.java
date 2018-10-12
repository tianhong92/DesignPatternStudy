package StructuralPattern.FacadePattern;

public class ShapeMaker {
    private Shape rectangle;
    public ShapeMaker() {
        rectangle = new Rectangle();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
}
