package cu.datys.patterns.gof.behavioral.chainofresponsibility.atm;

/**
 * Created by Alex on 08/02/2018.
 */
public abstract class Bill {
    private int count;
    private Bill successor;

    public Bill(int count) {
        this.count = count;
    }

    public int count() {
        return count;
    }

    public boolean canDoOperation(int cash){
        int min = Math.min(cash/getDenomination(), count);
        cash -= min * getDenomination();
        return cash == 0 ? true : successor.canDoOperation(cash);
    }

    public void setSuccessor(Bill successor){
        this.successor = successor;
    }

    public abstract int getDenomination();
}
