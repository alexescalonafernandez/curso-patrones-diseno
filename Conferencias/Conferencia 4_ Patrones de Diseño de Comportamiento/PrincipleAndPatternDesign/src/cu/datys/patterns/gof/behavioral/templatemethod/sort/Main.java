package cu.datys.patterns.gof.behavioral.templatemethod.sort;

/**
 * Created by alexander.escalona on 27/10/2017.
 */
public class Main {
    public static void main(String[] args) {
        BubbleSortTemplate template = new DescendingBubbleSort();
        int[] array = new int[]{2, 3, 1};

        template.sort(array);
        for (int e : array)
            System.out.println(e);

        System.out.println("-----------------");

        template = new AscendingBubbleSort();
        template.sort(array);
        for (int e : array)
            System.out.println(e);
    }

}
