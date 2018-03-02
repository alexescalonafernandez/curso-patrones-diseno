package cu.datys.principles.srp.modem.bad;

/**
 * Created by alexander.escalona on 25/01/2018.
 */
public class ModemSlowClient {
    public static void main(String[] args) {

        IModem slowModem = new ModemSlow();

        slowModem.dial("0000000000");
        slowModem.send('t');
        slowModem.receive();
        slowModem.disconnect();
    }
}
