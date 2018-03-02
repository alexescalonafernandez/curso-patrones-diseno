package cu.datys.patterns.gof.structural.bridge.tv;

/**
 * Created by alexander.escalona on 25/10/2017.
 */
public class SonyTV implements TV {
    private int currentChannel;
    private boolean flag;

    public SonyTV() {
        this.currentChannel = getMinChannel();
    }

    public void on() {
        flag = true;
    }

    public void off() {
        flag = false;
    }

    public void channel(int channel) {
        if(!flag)
            return;
        if(channel >= getMinChannel() && channel <= getMaxChannel()){
            currentChannel = channel;
            System.out.println(String.format("Current channel is %d", currentChannel));
        }
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public int getMinChannel() {
        return 1;
    }

    public int getMaxChannel() {
        return 100;
    }
}
