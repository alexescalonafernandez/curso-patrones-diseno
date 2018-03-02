package cu.datys.principles.srp.modem.bad;

/**
 * Created by alexander.escalona on 25/01/2018.
 */
public class ModemFastClient {
    public static void main(String[] args) {

        IModem fastModem = new ModemFast();

        fastModem.dial("0000000000");
        fastModem.send('t');
        fastModem.receive();
        fastModem.disconnect();
    }
}
