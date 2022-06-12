package CreationalPatterns.prototype2;

import CreationalPatterns.Bridge.Circle;

import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable<String, Shape> mp = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId){
        Shape cachedShape = mp.get(shapeId);

        return (Shape) cachedShape.clone();
    }

    public static void loadCache(){
        Square square = new Square();
        square.setId("1");
        mp.put(square.getId(), square );

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        mp.put(rectangle.getId(), rectangle );



    }

}
