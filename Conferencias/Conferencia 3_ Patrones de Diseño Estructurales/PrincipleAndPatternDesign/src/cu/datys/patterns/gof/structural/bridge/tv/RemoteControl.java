package cu.datys.patterns.gof.structural.bridge.tv;

/**
 * Created by alexander.escalona on 25/10/2017.
 */
public abstract class RemoteControl implements Control{
    protected TV implementor;

    public RemoteControl(TV implementor) {
        this.implementor = implementor;
    }

    public void on() {
        implementor.on();
    }

    public void off() {
        implementor.off();
    }

    public void channel(int channel) {
        implementor.channel(channel);
    }

    public int getCurrentChannel() {
        return implementor.getCurrentChannel();
    }

    public void upChannel(){
        implementor.channel(implementor.getCurrentChannel() + 1);
    }

    public void downChannel(){
        implementor.channel(implementor.getCurrentChannel() - 1);
    }
}
