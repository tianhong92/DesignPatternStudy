package StructuralPattern.BridgePattern;

// 抽象类和实现类的解耦， 使得两者能够独立变化
public class main {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
