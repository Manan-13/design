package designpatterns.creational.builder;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        User user =  User.builder()
                .name("Manan")
                .age(4)
                .build();

        System.out.println(user);
    }

}
