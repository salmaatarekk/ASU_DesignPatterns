package CreationalPatterns.AbstractFactoryPattern;

public class RoundedShapeFactory extends AbstractFactory {
    public static String RoundedRect = "RoundedRect";
    public static String RoundedSQU = "RoundedSQU";

    public  BaseShape getShape (String s){
        if(s.equals(RoundedRect))
            return new RoundedRectangle();
        return null;
    }
}
