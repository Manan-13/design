package designpatterns.behavioural.mediator;

public class Main {
    public static void main(String[] args) {
        ChatRoomMediator room = new ChatRoom();

        User manan = new User("Manan", room);
        User raj = new User("Raj", room);

        manan.send("Hello, Raj!");
        raj.send("Hey Manan! How are you?");    }
}
