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
        return total == -1;
    }

    boolean isFull() {
        return total == 11;
    }

    int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

}
