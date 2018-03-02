package cu.datys.patterns.gof.behavioral.interpreter.roman;

/**
 * Created by alexander.escalona on 26/10/2017.
 */
public class ThousandExpression extends AbstractExpression {
    public String one() {
        return "M";
    }

    public String four() {
        return " ";
    }

    public String five() {
        return " ";
    }

    public String nine() {
        return " ";
    }

    public int multiplier() {
        return 1000;
    }
}
