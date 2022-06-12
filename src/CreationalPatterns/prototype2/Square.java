package CreationalPatterns.prototype2;

public class Square extends Shape{
    public Square(){
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square");
    }
}
