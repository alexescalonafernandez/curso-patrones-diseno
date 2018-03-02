package cu.datys.principles.srp.modem.good;

/**
 * Created by alexander.escalona on 25/01/2018.
 */
public class DataChannelSlowMode implements IDataChannel {

    @Override
    public void send(char c) {
        // TODO Auto-generated method stub
        System.out.println("sent data using slow algorithm");
    }

    @Override
    public char receive() {
        // TODO Auto-generated method stub
        System.out.println("recieved data using slow algorithm");
        return 0;
    }
}
