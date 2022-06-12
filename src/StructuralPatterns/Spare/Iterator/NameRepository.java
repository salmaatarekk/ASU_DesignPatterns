package StructuralPatterns.Spare.Iterator;

public class NameRepository implements Container {

    public String names[] = {"Ropert", "John", "Julie", "Lora"};
    private Iterator nameIter;


    @Override
    public Iterator getIterator() {
        nameIter = new NameIterator(names);
        return nameIter;
    }
}
