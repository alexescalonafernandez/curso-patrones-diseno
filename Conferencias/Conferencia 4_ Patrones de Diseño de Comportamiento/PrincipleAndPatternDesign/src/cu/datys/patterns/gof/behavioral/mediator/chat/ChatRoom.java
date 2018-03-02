package cu.datys.patterns.gof.behavioral.mediator.chat;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexander.escalona on 26/10/2017.
 */
public class ChatRoom implements IMediator{
    private List<IColleague> colleagueList;

    public ChatRoom() {
        this.colleagueList = new ArrayList<IColleague>();
    }

    public void addColleague(IColleague colleague) {
        if(!colleagueList.contains(colleague)){
            for (IColleague c : colleagueList)
                c.receive(String.format("The user %s is now connected", colleague.getName()));
            colleagueList.add(colleague);
        }

    }

    public void send(String message, IColleague originator) {
        for (IColleague c : colleagueList)
            if(!c.equals(originator))
                c.receive(message);
    }
}
