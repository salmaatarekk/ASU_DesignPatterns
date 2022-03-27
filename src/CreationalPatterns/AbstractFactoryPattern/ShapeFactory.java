package CreationalPatterns.AbstractFactoryPattern;

public class ShapeFactory extends AbstractFactory {
    public static String Rect = "Rect";
    public static String SQU = "SQU";

    public  BaseShape getShape (String s){
        if(s.equals(Rect))
            return new Rectanlge();
        return null;
    }
}
