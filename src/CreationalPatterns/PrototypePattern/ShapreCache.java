package CreationalPatterns.PrototypePattern;

import java.util.HashMap;

public class ShapreCache {
    private static HashMap<String, Shape> mp = new HashMap<String, Shape>();
    public static Shape getShape(String shapeId) {
        Shape cachedShape = mp.get(shapeId);
        return (Shape) cachedShape.clone();
    }
    public static void loadCache() {
        Square square = new Square();
        square.name = "Square1";
        mp.put(square.name,square);
        Rectangle rectangle = new Rectangle();
        rectangle.name = "rectangle1";
        mp.put(rectangle.name, rectangle);
    }
}
