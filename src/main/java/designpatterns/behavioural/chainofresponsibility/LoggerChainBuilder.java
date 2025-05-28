package designpatterns.behavioural.chainofresponsibility;

public class LoggerChainBuilder {

    public static Logger getChainOfLogs(){
        Logger errorLogger = new ErrorLogger(LogLevel.ERROR);
        Logger debugLogger = new DebugLogger(LogLevel.DEBUG);
        Logger infoLogger = new InfoLogger(LogLevel.INFO);

        errorLogger.setNext(debugLogger);
        debugLogger.setNext(infoLogger);

        return errorLogger;
    }
}
