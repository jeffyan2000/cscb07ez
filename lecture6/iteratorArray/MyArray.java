package lecture6.iteratorArray;

public class MyArray implements MyIterable<Integer>{
    private Integer[] array;

    public MyArray(Integer[] array) {
        this.array = array;
    }

    public MyIterator<Integer> iterator() {
        return new MyArrayIterator<Integer>(array);
    }
}
