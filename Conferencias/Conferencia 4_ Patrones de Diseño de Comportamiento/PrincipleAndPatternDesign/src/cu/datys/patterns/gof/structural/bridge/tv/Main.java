package cu.datys.patterns.gof.structural.bridge.tv;

/**
 * Created by alexander.escalona on 25/10/2017.
 */
public class Main {
    public static void main(String[] args) {
        SonyTV tv = new SonyTV();
        ConcreteRemoteControl control = new ConcreteRemoteControl(tv);
        control.upChannel();
        System.out.println(control.getCurrentChannel());
        control.on();
        control.upChannel();
        System.out.println(control.getCurrentChannel());

    }
}
