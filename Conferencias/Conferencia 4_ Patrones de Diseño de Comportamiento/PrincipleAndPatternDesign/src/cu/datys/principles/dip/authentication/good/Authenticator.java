package cu.datys.principles.dip.authentication.good;

/**
 * Created by Alex on 25/01/2018.
 */
public interface Authenticator {
    boolean authenticate(User user);
}
