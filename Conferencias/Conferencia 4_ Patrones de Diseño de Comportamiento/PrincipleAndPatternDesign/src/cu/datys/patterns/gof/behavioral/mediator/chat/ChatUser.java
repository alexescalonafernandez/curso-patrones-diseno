package cu.datys.patterns.gof.behavioral.mediator.chat;

/**
 * Created by alexander.escalona on 26/10/2017.
 */
public class ChatUser implements IColleague {
    private ChatRoom chatRoom;
    private String name;

    public ChatUser(ChatRoom chatRoom, String name) {
        this.chatRoom = chatRoom;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void send(String message) {
        chatRoom.send(message, this);
    }

    public void receive(String message) {
        System.out.println(String.format("User %s has received message: %s", name, message));
    }
}
