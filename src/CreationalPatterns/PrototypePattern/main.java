package CreationalPatterns.PrototypePattern;

public class main {
    public static void main(String [] args){
        ShapreCache.loadCache();
        Shape clonedShape = (Shape) ShapreCache.getShape("Square1");
        System.out.println("Shape " + clonedShape.name);

    }
}
