package lecture6.iteratorArray;

public class ExecuteIteratorArray {
    public static void main(String[] args) {
        MyArray array = new MyArray(new Integer[]{1, 2, 3, 4, 5});
        MyIterator<Integer> iterator = array.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        };
    }
}
