package cu.datys.principles.srp.modem.good;

/**
 * Created by alexander.escalona on 25/01/2018.
 */
public class ModemFastClient {
    public static void main(String[] args) {

        Modem modem = new Modem(new ConnectionManager(), new DataChannelFastMode());

        modem.dial("0000000000");
        modem.send('t');
        modem.receive();
        modem.disconnect();
    }
}
