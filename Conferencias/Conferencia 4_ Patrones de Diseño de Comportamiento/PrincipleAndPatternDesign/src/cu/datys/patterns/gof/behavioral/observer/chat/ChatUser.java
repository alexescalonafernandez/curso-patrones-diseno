package cu.datys.patterns.gof.behavioral.observer.chat;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by alexander.escalona on 26/10/2017.
 */
public class ChatUser implements Observer {
    private ChatRoom chatRoom;
    private String name;

    public ChatUser(ChatRoom chatRoom, String name) {
        this.chatRoom = chatRoom;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void update(Observable o, Object arg) {
        ChatRoom.Message message = (ChatRoom.Message) arg;
        if(!this.equals(message.user))
            System.out.println(
                    String.format(
                            "User %s has received from user %s the message: %s",
                            name,
                            message.user.getName(),
                            message.data
                    )
            );
    }

    public void send(String message) {
        chatRoom.send(message, this);
    }
}
