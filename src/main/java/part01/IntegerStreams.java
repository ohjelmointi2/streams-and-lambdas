package part01;

import java.util.stream.IntStream;

/**
 * A utility class for generating and utilizing numeric streams. Numbers can
 * be used in generic streams (Stream<Integer>), but Java also provides special
 * streams for primitive types. These special streams, such as IntStream, have
 * additional methods that are useful for numeric operations.
 */
public class IntegerStreams {

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
        /*
         * hint: see the documentation of IntStream about how to create a range of
         * numbers. A closed range means that the 'to' value is included in the range,
         * whereas an open range does not include the 'to' value.
         */
        return IntStream.rangeClosed(from, to);
    }

    /**
     * Returns the sum of integers in the specified IntStream.
     *
     * @param stream the IntStream to sum
     * @return the sum of the numbers in the stream
     */
    public int sum(IntStream stream) {
        // hint: see the documentation of IntStream about how to get the sum of the
        // numbers in the stream.
        return stream.sum();
    }

    /**
     * Returns the number of values in the specified IntStream. As the number of
     * values may be larger than the int type can represent, the return type is
     * long. You can assume that the stream is not infinite, although infinite
     * streams are possible in Java.
     *
     * @param stream the IntStream to count
     * @return the number of values in the stream (which may be over
     *         Integer.MAX_VALUE)
     */
    public long countNumbersInStream(IntStream stream) {
        // hint: see the documentation of IntStream about how to count the number of
        // elements in the stream.
        return stream.count();
    }
}
