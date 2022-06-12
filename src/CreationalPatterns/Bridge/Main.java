package CreationalPatterns.Bridge;

public class Main {
    public  static void main(String [] args){
        Shape resCircle = new Circle(100, 100, 10, new RedCricle());
        Shape greenCirle = new Circle(100, 100, 10, new GreenCirlcle());

        resCircle.draw();
        greenCirle.draw();
    }
}
