package cu.datys.patterns.gof.behavioral.mediator.chat;

/**
 * Created by alexander.escalona on 26/10/2017.
 */
public interface IColleague {
    String getName();
    void send(String message);
    void receive(String message);
}
