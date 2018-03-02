package cu.datys.patterns.gof.behavioral.templatemethod.sort;

/**
 * Created by alexander.escalona on 27/10/2017.
 */
public abstract class BubbleSortTemplate {

    public void sort(int[] array){
        int length = array.length;
        for(int i = length - 1; i > 0; i--)
            for (int j = 1; j < length; j++)
                if(mustSwap(array[j - 1], array[j]))
                    swap(array, j - 1, j);

    }

    private void swap(int[] array, int i, int j){
        array[i] ^= array[j];
        array[j] ^= array[i];
        array[i] ^= array[j];
    }

    protected abstract boolean mustSwap(int a, int b);
}
