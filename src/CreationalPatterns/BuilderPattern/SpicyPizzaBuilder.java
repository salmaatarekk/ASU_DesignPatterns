package CreationalPatterns.BuilderPattern;

public class SpicyPizzaBuilder extends PizzaBuilder{
    @Override
    public void preparePizza() {
        System.out.println("Prepraring Spicy pizza");
        pizza = new Pizza();
    }
}
