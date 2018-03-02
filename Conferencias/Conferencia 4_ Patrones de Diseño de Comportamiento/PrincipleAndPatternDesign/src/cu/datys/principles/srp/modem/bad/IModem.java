package cu.datys.principles.srp.modem.bad;

/**
 * Created by alexander.escalona on 25/01/2018.
 */
public interface IModem {
    // --- Connection management responsibilities = dial, disconnect

    public void dial(String phoneNumber);

    public void disconnect();

    // --- Data management responsibilities = send, receive

    public void send(char c);

    public char receive();
}
