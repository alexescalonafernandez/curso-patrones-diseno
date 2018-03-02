package cu.datys.patterns.gof.behavioral.interpreter.roman;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexander.escalona on 26/10/2017.
 */
public class Interpreter {
    private Context context;
    private List<AbstractExpression> evaluator;

    public Interpreter() {
        context = new Context();
        evaluator = new ArrayList<AbstractExpression>();
        evaluator.add(new ThousandExpression());
        evaluator.add(new HundredExpression());
        evaluator.add(new TenExpression());
        evaluator.add(new OneExpression());
    }

    public int roman2decimal(String roman){
        context.setRoman(roman);
        context.setValue(0);
        for(AbstractExpression e : evaluator)
            e.interpret(context);
        return context.getValue();
    }
}
