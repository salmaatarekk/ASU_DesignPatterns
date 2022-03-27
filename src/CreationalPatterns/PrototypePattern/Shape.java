package CreationalPatterns.PrototypePattern;

public class Shape implements Cloneable{
    protected String type, name;
    public Object clone(){
        Object res = null;
        try{
            res = super.clone();

        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return res;
    }
}
