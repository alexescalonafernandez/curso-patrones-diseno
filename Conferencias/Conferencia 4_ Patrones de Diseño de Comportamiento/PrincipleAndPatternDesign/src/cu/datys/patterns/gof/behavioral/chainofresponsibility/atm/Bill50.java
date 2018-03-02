package cu.datys.patterns.gof.behavioral.chainofresponsibility.atm;

/**
 * Created by Alex on 08/02/2018.
 */
public class Bill50 extends Bill {
    public Bill50(int count) {
        super(count);
    }

    @Override
    public int getDenomination() {
        return 50;
    }
}
