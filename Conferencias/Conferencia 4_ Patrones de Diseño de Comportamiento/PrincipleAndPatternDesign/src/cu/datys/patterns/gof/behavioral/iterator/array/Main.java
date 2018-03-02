package cu.datys.patterns.gof.behavioral.iterator.array;

/**
 * Created by alexander.escalona on 26/10/2017.
 */
public class Main {
    public static void main(String[] args) {
        ArrayIterator<Integer> it = new ArrayIterator<Integer>(new Integer[]{0, 1, 2});
        while (it.hasNext())
            System.out.println(it.next());
    }
}
