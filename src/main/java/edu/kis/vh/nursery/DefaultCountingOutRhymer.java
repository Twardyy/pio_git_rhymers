package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int TAB_CAPACITY = 12;
    public static final int STARTING_VALUE = -1;
    private int[] numbers = new int[TAB_CAPACITY];

    public int total = STARTING_VALUE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }
        public boolean callCheck() {
            return total == STARTING_VALUE;
        }

            public boolean isFull() {
                return total == TAB_CAPACITY-1;
            }
        
                protected int peekaboo() {
                    if (callCheck())
                        return STARTING_VALUE;
                    return numbers[total];
                }
            
                    public int countOut() {
                        if (callCheck())
                            return STARTING_VALUE;
                        return numbers[total--];
                    }

}
