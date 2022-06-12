package StructuralPatterns.Spare.ChainOfResponsibility;

public abstract class AbstractLogger {
    protected int level;
    protected static int DEBUG = 2;
    protected static int ERROR = 1;
    protected static int Info = 0;
    protected  AbstractLogger nextLogger;

    public AbstractLogger(int l){
        level = l;
    }
    public void setNextLogger(AbstractLogger l){
        nextLogger= l;
    }

    public abstract void write(String m);

    public void logMessage(String message, int level){
        if(level >= this.level){
            write(message);
        }
        if(nextLogger != null){
            nextLogger.logMessage(message, level);
        }
    }


}
