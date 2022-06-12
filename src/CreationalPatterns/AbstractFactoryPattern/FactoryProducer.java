package CreationalPatterns.AbstractFactoryPattern;

public class FactoryProducer {
    public static String RoundedFact = "RoundedFact";
    public static String NormalFact = "NormalFact";
    public AbstractFactory getFactory(String s){
        if(s.equals(RoundedFact))
            return new RoundedShapeFactory();
        else if( s.equalsIgnoreCase(NormalFact))
            return new ShapeFactory();
        return null;
    }
}
