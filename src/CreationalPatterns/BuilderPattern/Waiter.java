package CreationalPatterns.BuilderPattern;

public class Waiter {
    private PizzaBuilder builder;
    public void setBuilder(PizzaBuilder pb){
        builder = pb;
    }
    public PizzaBuilder getBuilder() {
        return builder;
    }
    public void preparePizza(){
        builder.preparePizza();
    }
}
