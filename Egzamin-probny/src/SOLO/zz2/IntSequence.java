package SOLO.zz2;

import java.util.Arrays;
import java.util.stream.Stream;

public interface IntSequence {
//    static IntSequence of(int... integers){
//        return new IntSequence() {
//            public Stream<Integer> sequenceStream(){
//                return Stream.concat(Arrays.stream(integers).boxed(), Stream.generate(() -> 1));
//            }
//        };
//    }
// Jak zrobić anonimową?

    static Stream<Integer> of(int... integers){
        return Stream.concat(Arrays.stream(integers).boxed(), Stream.generate(() -> 1));
        }

    static Stream<Integer> squares(int n){
        final int[] n1 = {n - 1};
        return Stream.generate(() -> {
            ++n1[0];
            return n1[0] * n1[0];
        });
    }
}

