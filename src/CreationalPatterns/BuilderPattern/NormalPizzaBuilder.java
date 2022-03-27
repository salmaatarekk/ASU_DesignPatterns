package CreationalPatterns.BuilderPattern;

public class NormalPizzaBuilder extends PizzaBuilder{
    @Override
    public void preparePizza() {
        System.out.println("Prepraring normal pizza");
        pizza = new Pizza();
    }
}
