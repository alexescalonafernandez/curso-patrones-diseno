package cu.datys.patterns.gof.behavioral.templatemethod.sort;

/**
 * Created by alexander.escalona on 27/10/2017.
 */
public class AscendingBubbleSort extends BubbleSortTemplate {
    protected boolean mustSwap(int a, int b) {
        return b > a;
    }
}
