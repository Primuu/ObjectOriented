package Z2;

public class IntSequenceTest {
    public static void main(String[] args) {
        int counter = 0;

        IntSequence sequence = IntSequence.of(3, 1, 4, 1, 5, 9);
        while (sequence.hasNext() & counter <10){
            System.out.println(sequence.next());
            counter++;
        }

        counter = 0;

        IntSequence sequence2 = IntSequence.squares(3);
        while (sequence2.hasNext() & counter <10){
            System.out.println(sequence2.next());
            counter++;
        }
    }
}
