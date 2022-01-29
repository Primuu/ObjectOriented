package SOLO.zz2;

import java.util.stream.Stream;

public class IntSequenceTest {
    public static void main(String[] args) {

        //IntSequence sequence = IntSequence.of(3, 1, 4, 1, 5, 9);
        Stream<Integer> firstSequence = IntSequence.of(3, 1, 4, 1, 5, 9);
        firstSequence.limit(10).forEach(System.out::println);

        System.out.println();

        Stream<Integer> secondSequence = IntSequence.squares(3);
        secondSequence.limit(10).forEach(System.out::println);
    }
}
