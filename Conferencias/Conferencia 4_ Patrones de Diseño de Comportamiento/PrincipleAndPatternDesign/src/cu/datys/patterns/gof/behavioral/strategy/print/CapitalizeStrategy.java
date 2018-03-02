package cu.datys.patterns.gof.behavioral.strategy.print;

/**
 * Created by alexander.escalona on 27/10/2017.
 */
public class CapitalizeStrategy implements IPrintStrategy {
    public void print(String message) {
        System.out.println(String.format("%s%s", message.substring(0, 1).toUpperCase(), message.substring(1)));
    }
}
