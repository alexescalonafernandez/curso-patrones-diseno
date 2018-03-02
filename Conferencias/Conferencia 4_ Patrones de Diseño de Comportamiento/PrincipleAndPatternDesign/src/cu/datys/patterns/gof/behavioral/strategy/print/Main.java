package cu.datys.patterns.gof.behavioral.strategy.print;

/**
 * Created by alexander.escalona on 27/10/2017.
 */
public class Main {
    public static void main(String[] args) {
        PrintContext context = new PrintContext(new LowerCaseStrategy());
        context.print("HELLO");

        context.setStrategy(new UpperCaseStrategy());
        context.print("hello");

        context.setStrategy(new CapitalizeStrategy());
        context.print("hello");
    }
}
