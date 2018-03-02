package cu.datys.patterns.gof.creational.builder.user;

/**
 * Created by alexander.escalona on 25/10/2017.
 */
public class Main {
    public static void main(String[] args) {
        User user = new User.Builder("jhon", "jhon@gmail.com")
                .phone("123456789")
                .address("Fomento")
                .build();
    }
}
