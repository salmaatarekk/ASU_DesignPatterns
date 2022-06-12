package StructuralPatterns.Spare.ChainOfResponsibility;

public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int l){
        super(l);
    }

    @Override
    public void write(String m) {
        System.out.println("Error" + m);
    }
}
