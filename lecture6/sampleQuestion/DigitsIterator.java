package lecture6.sampleQuestion;

import java.util.Iterator;

class DigitsIterator implements Iterator<Integer> {
    private int value;

    public DigitsIterator(int value) {
        this.value = value;
    }

    public boolean hasNext() {
        return value >= 10;
    }

    public Integer next() {
        return this.value % 10;
    }
}

class Digits implements Iterable<Integer> {
    private int value;

    public Digits(int value) {
        System.out.println("Digits of " + value);
        this.value = value;
    }

    public Iterator<Integer> iterator() {
        return new DigitsIterator(this.value);
    }
}

class ExecuteTest {
    public static void main(String[] args) {
        Digits digits = new Digits(2019);
        for (Integer digit : digits) {
            System.out.println(digit);
        }
    }
}