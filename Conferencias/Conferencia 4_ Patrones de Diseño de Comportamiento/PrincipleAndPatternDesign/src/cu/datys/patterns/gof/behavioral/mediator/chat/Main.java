package cu.datys.patterns.gof.behavioral.mediator.chat;

/**
 * Created by alexander.escalona on 26/10/2017.
 */
public class Main {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();
        ChatUser john = new ChatUser(chatRoom, "john");
        ChatUser peter = new ChatUser(chatRoom, "peter");

        chatRoom.addColleague(john);
        chatRoom.addColleague(peter);

        peter.send("Hello");
    }
}
