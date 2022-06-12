package CreationalPatterns.Bridge;

public abstract class Shape {
    DrawApi drawApi;

    protected Shape(DrawApi drawApi){
        this.drawApi = drawApi;
    }

    public abstract void draw();



}
