package cu.datys.patterns.gof.behavioral.interpreter.roman;

/**
 * Created by alexander.escalona on 26/10/2017.
 */
public class TenExpression extends AbstractExpression {
    public String one() {
        return "X";
    }

    public String four() {
        return "XL";
    }

    public String five() {
        return "L";
    }

    public String nine() {
        return "XC";
    }

    public int multiplier() {
        return 10;
    }
}
