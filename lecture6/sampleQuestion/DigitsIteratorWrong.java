package lecture6.sampleQuestion;

import java.util.Iterator;

class DigitsIteratorWrong implements Iterator<Integer> {
    private int value;

    public DigitsIteratorWrong(int value) {
        this.value = value;
    }

    public boolean hasNext() {
        return value >= 10;
    }

    public Integer next() {
        return this.value % 10;
    }
}

class DigitsWrong implements Iterable<Integer> {
    private int value;

    public DigitsWrong(int value) {
        System.out.println("Digits of " + value);
        this.value = value;
    }

    public Iterator<Integer> iterator() {
        return new DigitsIteratorWrong(this.value);
    }
}

class ExecuteTestWrong {
    public static void main(String[] args) {
        DigitsWrong digits = new DigitsWrong(2019);
        for (Integer digit : digits) {
            System.out.println(digit);
        }
    }
}