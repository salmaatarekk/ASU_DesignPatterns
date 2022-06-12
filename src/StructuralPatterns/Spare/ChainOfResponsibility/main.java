package StructuralPatterns.Spare.ChainOfResponsibility;

public class main {
    public static void main(String[]  args){
        ErrorLogger error = new ErrorLogger(AbstractLogger.ERROR);
        InfoLogger info = new InfoLogger(AbstractLogger.Info);

        error.setNextLogger(info);

        error.logMessage(" Hi", 1);

        error.logMessage(" Hi again" , 0);

    }

}
