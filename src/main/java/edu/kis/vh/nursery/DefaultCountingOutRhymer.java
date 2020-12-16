package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static int NUMBER_TOTAL = -1;
    public static int NUMBER_COUNT = 12;

    private int[] numbers = new int[NUMBER_COUNT];

    public int total = NUMBER_TOTAL;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == -1;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
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
