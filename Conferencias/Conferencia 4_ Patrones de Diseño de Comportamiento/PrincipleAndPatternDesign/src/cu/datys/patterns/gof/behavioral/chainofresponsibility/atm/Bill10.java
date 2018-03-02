package cu.datys.patterns.gof.behavioral.chainofresponsibility.atm;

/**
 * Created by Alex on 08/02/2018.
 */
public class Bill10 extends Bill {
    public Bill10(int count) {
        super(count);
    }

    @Override
    public int getDenomination() {
        return 10;
    }
}
