package CreationalPatterns.Singleton;

public class Singleton {
    public static Singleton instance = null;
    private Singleton(){
    }
    public static Singleton getInstance(){
        if(instance == null)
            return new Singleton();
        return instance;
    }
}
