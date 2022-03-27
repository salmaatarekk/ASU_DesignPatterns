package CreationalPatterns.BuilderPattern;

public abstract class PizzaBuilder {

    protected Pizza pizza;
    public Pizza getPizza(){
        return pizza;
    }
    public abstract void preparePizza();
}

