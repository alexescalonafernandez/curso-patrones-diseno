package cu.datys.patterns.gof.behavioral.interpreter.roman;

/**
 * Created by alexander.escalona on 26/10/2017.
 */
public class HundredExpression extends AbstractExpression {
    public String one() {
        return "C";
    }

    public String four() {
        return "CD";
    }

    public String five() {
        return "D";
    }

    public String nine() {
        return "CM";
    }

    public int multiplier() {
        return 100;
    }
}
