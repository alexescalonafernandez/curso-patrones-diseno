package cu.datys.patterns.gof.behavioral.mediator.chat;

/**
 * Created by alexander.escalona on 26/10/2017.
 */
public interface IMediator {
    void addColleague(IColleague colleague);
    void send(String message, IColleague originator);
}
