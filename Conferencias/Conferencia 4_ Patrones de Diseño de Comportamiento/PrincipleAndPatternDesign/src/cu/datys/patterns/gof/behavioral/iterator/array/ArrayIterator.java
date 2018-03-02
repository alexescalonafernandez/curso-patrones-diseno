package cu.datys.patterns.gof.behavioral.iterator.array;

import java.util.Iterator;

/**
 * Created by alexander.escalona on 26/10/2017.
 */
public class ArrayIterator<T> implements Iterator<T> {
    private T[] array;
    private int index;

    public ArrayIterator(T[] array) {
        this.array = array;
    }

    public boolean hasNext() {
        return index < array.length;
    }

    public T next() {
        if(index < array.length)
            return array[index++];
        else throw new IndexOutOfBoundsException();
    }

    public void remove() {
        throw new UnsupportedOperationException("Not yet supported");
    }
}
