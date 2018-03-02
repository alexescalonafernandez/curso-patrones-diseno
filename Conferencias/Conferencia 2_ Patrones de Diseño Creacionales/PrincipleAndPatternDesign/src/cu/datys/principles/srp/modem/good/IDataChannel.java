package cu.datys.principles.srp.modem.good;

/**
 * Created by alexander.escalona on 25/01/2018.
 */
public interface IDataChannel {
    void send(char c);
    char receive();
}
