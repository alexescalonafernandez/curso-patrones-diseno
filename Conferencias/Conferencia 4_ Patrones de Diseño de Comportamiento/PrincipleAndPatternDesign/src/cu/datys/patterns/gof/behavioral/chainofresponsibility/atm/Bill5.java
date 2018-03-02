package cu.datys.patterns.gof.behavioral.chainofresponsibility.atm;

/**
 * Created by Alex on 08/02/2018.
 */
public class Bill5 extends Bill {
    public Bill5(int count) {
        super(count);
    }

    @Override
    public int getDenomination() {
        return 5;
    }
}
