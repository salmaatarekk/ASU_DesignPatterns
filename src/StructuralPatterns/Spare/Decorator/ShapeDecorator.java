package StructuralPatterns.Spare.Decorator;

public abstract class ShapeDecorator implements Shape{
    protected Shape decoratedShape;
    public ShapeDecorator(Shape decor){
        decoratedShape = decor;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
