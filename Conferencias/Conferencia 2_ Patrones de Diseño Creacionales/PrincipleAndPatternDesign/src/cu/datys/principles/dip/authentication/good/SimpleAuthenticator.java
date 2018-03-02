package cu.datys.principles.dip.authentication.good;

/**
 * Created by Alex on 25/01/2018.
 */
public class SimpleAuthenticator implements Authenticator {

    public boolean authenticate(User user) {
        return true;
    }
}
