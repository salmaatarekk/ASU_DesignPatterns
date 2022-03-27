package CreationalPatterns.AbstractFactoryPattern;

import CreationalPatterns.FactoryPattern.Shape;
import CreationalPatterns.FactoryPattern.ShapeFactory;

public class main {
    public static void main(String[] agrs){

        FactoryProducer factoryProducer = new FactoryProducer();
        AbstractFactory AB = factoryProducer.getFactory(FactoryProducer.RoundedFact);
        BaseShape BS = AB.getShape(RoundedShapeFactory.RoundedRect);
        BS.Draw();
    }
}
