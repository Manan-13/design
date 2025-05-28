package designpatterns.behavioural.chainofresponsibility;

public class DebugLogger extends Logger{

    DebugLogger(int level){
        this.level = level;
    }

    @Override
    void write(String message) {
        System.out.println("DEBUG: ".concat(message));
    }
}
