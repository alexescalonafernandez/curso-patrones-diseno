package cu.datys.patterns.gof.structural.bridge.tv;

/**
 * Created by alexander.escalona on 25/10/2017.
 */
public interface Control {
    void on();
    void off();
    void channel(int channel);
    int getCurrentChannel();
}
