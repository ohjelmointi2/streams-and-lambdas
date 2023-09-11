package part01;

import java.util.stream.IntStream;

/**
 * A utility class for generating various types of numeric streams.
 *
 * The Javadoc for this class has been generated with ChatGPT (GPT-3.5).
 */
public class NumericStreams {

    /**
     * Generates an inclusive range of integer numbers between the specified 'from'
     * and 'to' values.
     *
     * @param from the starting value (inclusive) of the range
     * @param to   the ending value (inclusive) of the range
     * @return an IntStream containing the numbers between 'from' and 'to'
     *         (inclusive)
     */
    public IntStream numbersBetween(int from, int to) {
        return IntStream.rangeClosed(from, to);
    }

    /**
     * Generates a stream of even integer numbers between the specified 'from' and
     * 'to' values.
     *
     * @param from the starting value (inclusive) of the range
     * @param to   the ending value (inclusive) of the range
     * @return an IntStream containing even numbers between 'from' and 'to'
     *         (inclusive)
     */
    public IntStream streamEvenNumbersBetween(int from, int to) {
        return numbersBetween(from, to).map(n -> n * 2);
    }

    /**
     * Generates a stream of odd integer numbers between the specified 'from' and
     * 'to' values.
     *
     * @param from the starting value (inclusive) of the range
     * @param to   the ending value (inclusive) of the range
     * @return an IntStream containing odd numbers between 'from' and 'to'
     *         (inclusive)
     */
    public IntStream oddNumbersBetween(int from, int to) {
        return numbersBetween(from, to).map(n -> n * 2 + 1);
    }

    /**
     * Generates a stream of squares of integer numbers starting from 1 up to
     * Integer.MAX_VALUE.
     *
     * @return an IntStream containing the squares of integer numbers
     */
    public IntStream streamSquares() {
        return IntStream.rangeClosed(1, (int) Math.sqrt(Integer.MAX_VALUE)).map(n -> n * n);
    }
}
