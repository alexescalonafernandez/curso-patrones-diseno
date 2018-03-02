package cu.datys.patterns.gof.behavioral.interpreter.roman;

/**
 * Created by alexander.escalona on 26/10/2017.
 */
public class OneExpression extends AbstractExpression {
    public String one() {
        return "I";
    }

    public String four() {
        return "IV";
    }

    public String five() {
        return "V";
    }

    public String nine() {
        return "IX";
    }

    public int multiplier() {
        return 1;
    }
}
