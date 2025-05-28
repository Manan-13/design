package designpatterns.behavioural.chainofresponsibility;

public class InfoLogger extends Logger{

    InfoLogger(int level){
        this.level = level;
    }

    @Override
    void write(String message) {
        System.out.println("INFO: ".concat(message));
    }
}
