package designpatterns.behavioural.chainofresponsibility;

public class ErrorLogger extends Logger{

    ErrorLogger(int level){
        this.level = level;
    }
    @Override
    void write(String message) {
        System.out.println("ERROR: ".concat(message));
    }
}
