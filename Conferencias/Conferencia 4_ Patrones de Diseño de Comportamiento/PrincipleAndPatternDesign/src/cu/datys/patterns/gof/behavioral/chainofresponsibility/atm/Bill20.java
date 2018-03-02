package cu.datys.patterns.gof.behavioral.chainofresponsibility.atm;

/**
 * Created by Alex on 08/02/2018.
 */
public class Bill20 extends Bill {
    public Bill20(int count) {
        super(count);
    }

    @Override
    public int getDenomination() {
        return 20;
    }
}
