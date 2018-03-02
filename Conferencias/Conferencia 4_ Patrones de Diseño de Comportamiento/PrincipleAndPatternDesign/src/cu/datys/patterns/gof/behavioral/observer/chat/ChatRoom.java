package cu.datys.patterns.gof.behavioral.observer.chat;

import java.util.Observable;

/**
 * Created by alexander.escalona on 26/10/2017.
 */
public class ChatRoom extends Observable{

    public void send(String message, ChatUser user) {
        setChanged();
        notifyObservers(new Message(user, message));
    }

    class Message{
        public final ChatUser user;
        public final String data;

        public Message(ChatUser user, String data) {
            this.user = user;
            this.data = data;
        }
    }
}
