package StructuralPatterns.Spare.Iterator;

public class NameIterator implements Iterator {

    protected String[] name;
    protected int index;

    public NameIterator(String[] names){
        this.name = names;
    }

    @Override
    public boolean hasNext() {
        if(index < name.length)
            return true;
        return false;
    }

    @Override
    public Object next() {
        if(this.hasNext()){
            return name[index++];
        }
        return null;
    }
}
