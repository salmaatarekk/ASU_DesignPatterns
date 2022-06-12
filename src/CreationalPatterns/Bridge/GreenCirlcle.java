package CreationalPatterns.Bridge;

public class GreenCirlcle implements DrawApi{
    @Override
    public void draw(int radius, int x, int y) {
        System.out.println("Draw Green circle with radius : " + radius  + "x : " + x + "y " + y);
    }
}
