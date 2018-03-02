package cu.datys.patterns.gof.behavioral.strategy.print;

/**
 * Created by alexander.escalona on 27/10/2017.
 */
public class PrintContext {
    private IPrintStrategy strategy;

    public PrintContext(IPrintStrategy strategy) {
        this.strategy = strategy;
    }

    public IPrintStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(IPrintStrategy strategy) {
        this.strategy = strategy;
    }

    public void print(String message){
        strategy.print(message);
    }
}
