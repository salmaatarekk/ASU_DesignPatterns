package CreationalPatterns.Bridge;

public class RedCricle implements DrawApi{
    @Override
    public void draw(int radius, int x, int y) {
        System.out.println("Draw Red circle with radius : " + radius  + "x : " + x + "y " + y);
    }
}
