package Z2;

import java.util.Arrays;

public interface IntSequence {
    static IntSequence of(int... integers) {
        return new IntSequence() {
            private final int[] sequence = Arrays.stream(integers).toArray();
            private int pointer = 0;

            @Override
            public int next() {
                if (this.pointer < sequence.length) return this.sequence[pointer++];
                else return 1;
            }

        };
    }

    static IntSequence squares(int n) {
        return new IntSequence() {
            private int n1 = n - 1;

            @Override
            public int next() {
                ++n1;
                return n1 * n1;
            }
        };
    }

    default boolean hasNext(){
        return true;
    }

    int next();
}