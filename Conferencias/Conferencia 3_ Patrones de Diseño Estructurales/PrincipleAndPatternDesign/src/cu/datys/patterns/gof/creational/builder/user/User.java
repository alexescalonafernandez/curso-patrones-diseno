package cu.datys.patterns.gof.creational.builder.user;

/**
 * Created by alexander.escalona on 25/10/2017.
 */
public class User {
    private String name, mail, phone, address;

    private User(Builder builder) {
        this.name = builder.name;
        this.mail = builder.mail;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    static class Builder{
        private String name, mail, phone, address;

        public Builder(String name, String mail) {
            this.name = name;
            this.mail = mail;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }
}
