package cu.datys.patterns.gof.behavioral.chainofresponsibility.atm;

/**
 * Created by Alex on 08/02/2018.
 */
public class Bill1 extends Bill {
    public Bill1(int count) {
        super(count);
    }

    @Override
    public int getDenomination() {
        return 1;
    }
}
