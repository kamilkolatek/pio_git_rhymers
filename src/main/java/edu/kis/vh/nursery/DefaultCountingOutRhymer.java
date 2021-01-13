package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int NUMBER_TOTAL = -1;
    private static final int NUMBER_COUNT = 12;

    private int[] numbers = new int[NUMBER_COUNT];

    public int getTotal() {
        return total;
    }

    private int total = NUMBER_TOTAL;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    boolean callCheck() {
        return total == NUMBER_TOTAL;
    }

    boolean isFull() {
        return total == (NUMBER_COUNT - 1);
    }

    int peekaboo() {
        if (callCheck())
            return NUMBER_TOTAL;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return NUMBER_TOTAL;
        return numbers[total--];
    }

}
