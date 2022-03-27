package CreationalPatterns.FactoryPattern;

public class main {

    public static void main(String[] agrs){
            Shape shape = ShapeFactory.getShape("Rect");
            shape.Draw();
    }
}
