package designpatterns.behavioural.chainofresponsibility;

public class Main {
    public static void main(String[] args) {
        Logger logger = LoggerChainBuilder.getChainOfLogs();

        logger.logMessage(LogLevel.DEBUG, "This is a log message printed for debug levels and below");
        logger.logMessage(LogLevel.INFO, "This is a log message printed for info levels and below");
        logger.logMessage(LogLevel.ERROR, "This is a log message printed for error levels and below");
    }
}
