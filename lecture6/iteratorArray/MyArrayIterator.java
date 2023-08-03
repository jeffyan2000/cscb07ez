package lecture6.iteratorArray;

public class MyArrayIterator<T> implements MyIterator<T> {
    private T[] array;
    private int index;

    public MyArrayIterator(T[] array) {
        this.array = array;
        this.index = 0;
    }

    public boolean hasNext() {
        return index < array.length;
    }

    public T next() {
        return array[index++];
    }
}
