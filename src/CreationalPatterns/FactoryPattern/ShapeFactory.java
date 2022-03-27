package CreationalPatterns.FactoryPattern;

public class ShapeFactory {
    public static String Rect = "Rect";
    public static String SQU = "SQU";

    public static Shape getShape (String s){
        if(s.equals(Rect))
            return new Rectanlge();
        return null;
    }
}
