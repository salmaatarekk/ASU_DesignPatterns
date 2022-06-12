package StructuralPatterns.Spare.Decorator;

public class RedShapeDecorated extends ShapeDecorator{
    protected Shape decoratedShape;

    public RedShapeDecorated(Shape decor) {
        super(decor);
        decoratedShape = decor;
    }
    public void setBorder(Shape decor){
        System.out.println("Border Color : Red");
    }

    public void draw(){
        decoratedShape.draw();
        this.setBorder(decoratedShape);
    }
}
