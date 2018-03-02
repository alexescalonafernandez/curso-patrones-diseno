package cu.datys.principles.srp.modem.good;

/**
 * Created by alexander.escalona on 25/01/2018.
 */
public class DataChannelFastMode implements IDataChannel {

    @Override
    public void send(char c) {
        // TODO Auto-generated method stub
        System.out.println("sent data using fast algorithm");
    }

    @Override
    public char receive() {
        // TODO Auto-generated method stub
        System.out.println("received data using fast algorithm");
        return 0;
    }
}
