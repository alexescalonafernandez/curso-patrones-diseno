package cu.datys.principles.dip.authentication.bad;

/**
 * Created by Alex on 25/01/2018.
 */
public class LoginManager {

    SimpleAuthenticator simpleAuthenticator = new SimpleAuthenticator();

    public void login(User user) {
        simpleAuthenticator.authenticate(user);
    }
}
