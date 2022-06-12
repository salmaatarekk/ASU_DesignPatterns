package StructuralPatterns.Spare.ChainOfResponsibility;

public class InfoLogger extends AbstractLogger{

    public InfoLogger(int level){
        super(level);
    }

    @Override
    public void write(String m) {
        System.out.println("Info" + m);
    }
}
