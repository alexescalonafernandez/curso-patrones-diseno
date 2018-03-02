package cu.datys.principles.srp.modem.bad;

/**
 * Created by alexander.escalona on 25/01/2018.
 */
public class ModemSlow implements IModem {

    @Override
    public void dial(String phoneNumber) {
        // TODO Auto-generated method stub
        System.out.println("connected successfully");
    }

    @Override
    public void disconnect() {
        // TODO Auto-generated method stub
        System.out.println("disconnection successfully");
    }

    @Override
    public void send(char c) {
        // TODO Auto-generated method stub
        System.out.println("data sent successfully usign slow algorithms");
    }

    @Override
    public char receive() {
        // TODO Auto-generated method stub
        System.out.println("data received successfully using slow algorithms");
        return 0;
    }
}
