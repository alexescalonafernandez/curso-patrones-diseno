package cu.datys.principles.srp.modem.good;

/**
 * Created by alexander.escalona on 25/01/2018.
 */
public class ConnectionManager implements IConnection {

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
}
