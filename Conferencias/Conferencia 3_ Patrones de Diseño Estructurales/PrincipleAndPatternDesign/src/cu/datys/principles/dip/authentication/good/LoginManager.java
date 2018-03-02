package cu.datys.principles.dip.authentication.good;

/**
 * Created by Alex on 25/01/2018.
 */
public class LoginManager {

    Authenticator authenticator;

    public void setAuthenticator(Authenticator authenticator) {
        this.authenticator = authenticator;
    }

    public void login(User user) {
        authenticator.authenticate(user);
    }
}
