package cu.datys.patterns.gof.behavioral.observer.chat;

/**
 * Created by alexander.escalona on 26/10/2017.
 */
public class Main {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();
        ChatUser jhon = new ChatUser(chatRoom, "john");
        ChatUser peter = new ChatUser(chatRoom, "peter");

        chatRoom.addObserver(jhon);
        chatRoom.addObserver(peter);

        jhon.send("Hello");
    }
}
