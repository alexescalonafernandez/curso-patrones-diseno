package cu.datys.patterns.gof.structural.bridge.tv;

/**
 * Created by alexander.escalona on 25/10/2017.
 */
public class ConcreteRemoteControl extends RemoteControl {

    public ConcreteRemoteControl(TV implementor) {
        super(implementor);
    }
}
