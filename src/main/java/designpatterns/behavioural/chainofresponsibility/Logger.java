package designpatterns.behavioural.chainofresponsibility;

public abstract class Logger {

    int level;
    Logger nextLogger;

    public void setNext(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message){
        if(this.level <= level) write(message);
        if(nextLogger != null) nextLogger.logMessage(level, message);
    }

    abstract void write(String message);
}
