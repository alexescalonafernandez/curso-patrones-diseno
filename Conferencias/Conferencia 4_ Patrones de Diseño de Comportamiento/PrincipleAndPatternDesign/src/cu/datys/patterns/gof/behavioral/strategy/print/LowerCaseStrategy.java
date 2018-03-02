package cu.datys.patterns.gof.behavioral.strategy.print;

/**
 * Created by alexander.escalona on 27/10/2017.
 */
public class LowerCaseStrategy implements IPrintStrategy {
    public void print(String message) {
        System.out.println(message.toLowerCase());
    }
}
