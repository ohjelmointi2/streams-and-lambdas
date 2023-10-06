package part04;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * In this class, you will learn how to use the map() method to transform the
 * values in a stream. You will also learn how to convert a Stream<Integer> to
 * an IntStream, that has additional methods for numeric operations.
 *
 * Map is a method that is typically given a lambda expression or a method
 * reference as a parameter. The operation is applied to each element in the
 * stream, and the result of the operation is used as the new value for the
 * element. For example, if you have a stream of numbers, you can use the map()
 * method to double the values in the stream.
 *
 * The lambda expression may be a simple expression, such as x -> x * 2, or a
 * more complex expression, in which case you can define the operation as a
 * separate method and use a method reference.
 */
public class MappingStreams {

    /**
     * Returns a stream where all the numbers in the given stream are doubled
     * (multiplied by 2).
     *
     * @param numbers the stream of numbers to double
     * @return a stream of doubled numbers
     */
    public IntStream doubleValuesInStream(IntStream numbers) {
        // hint: use the map() method to double the values in the stream.
        return numbers.map(x -> x * 2);
    }

    /**
     * Returns a stream where all the numbers in the given stream are multiplied by
     * the specified multiplier.
     *
     * @param numbers
     * @param multiplier
     * @return
     */
    public IntStream multiplyValuesInStream(IntStream numbers, int multiplier) {
        // hint: use the map() method to multiply the values in the stream.
        return numbers.map(x -> x * multiplier);
    }

    /**
     * Creates an IntStream from the specified list of integers.
     *
     * @param numbers the list of integers to convert
     * @return an IntStream containing the numbers from the list
     */
    public IntStream mapListToIntStream(List<Integer> numbers) {
        // hint: use the stream() method to create a Stream<Integer>.
        // Then, use mapToInt() method to convert a Stream<Integer> to an IntStream.
        return numbers.stream().mapToInt(Integer::intValue);
    }

    /**
     * Returns a stream where all the strings in the given stream are prefixed with
     * the specified prefix. For example, if the prefix is "https://", the stream
     * {"ohjelmointi2.github.io", "python-ohjelmointi.github.io"} would become
     * {"https://ohjelmointi2.github.io", "https://python-ohjelmointi.github.io"}.
     *
     * @param strings the stream of strings to prefix
     * @param prefix  the prefix to add to each string
     * @return a stream of strings with the prefix added
     */
    public Stream<String> prefixAllStrings(Stream<String> strings, String prefix) {
        // hint: use the map() method to add the prefix to each string in the stream.
        return strings.map(str -> prefix + str);
    }

    /**
     * Returns a stream where all the strings in the given stream are suffixed with
     * the specified suffix. For example, if the suffix is "@example.com", the
     * stream {"root", "admin"} would become {"root@example.com",
     * "admin@example.com"}.
     *
     * @param strings the stream of strings to suffix
     * @param suffix  the suffix to add to each string
     * @return a stream of strings with the suffix added
     */
    public Stream<String> suffixAllStrings(Stream<String> strings, String suffix) {
        // hint: use the map() method to add the suffix to each string in the stream.
        return strings.map(str -> str + suffix);
    }

    /**
     * Returns a stream where all the strings in the given stream have the specified
     * suffix removed. For example, if the suffix is ".txt", the stream
     * {"uhat.txt", "mahdollisuudet.txt", "vahvuudet"} would become {"uhat",
     * "mahdollisuudet", "vahvuudet"}. Note that the suffix is removed only if the
     * string ends with the suffix.
     *
     * @param strings
     * @param suffix
     * @return
     */
    public Stream<String> removeSuffix(Stream<String> strings, String suffix) {
        // hint: use the map() method to remove the suffix from each string.
        // If your expression is too complex, you can define a separate method that
        // you call from the lambda expression.
        return strings.map(str -> str.endsWith(suffix) ? str.substring(0, str.length() - suffix.length()) : str);
    }

    /**
     * Returns a stream where all the numbers in the given stream are converted to
     * strings following the rules of the FizzBuzz game. For example, if the stream
     * contains the numbers 1, 2, 3, 4, 5, the resulting stream contains the strings
     * "1", "2", "Fizz", "4", "Buzz".
     *
     * @see https://en.wikipedia.org/wiki/Fizz_buzz
     * @param numbers the stream of numbers to convert
     * @return a stream of strings
     */
    public Stream<String> streamFizzBuzz(IntStream numbers) {
        /*
         * The FizzBuzz pattern is as follows:
         * - if the number is divisible by both 3 and 5, the string is "FizzBuzz"
         * - if the number is divisible by 3, the string is "Fizz"
         * - if the number is divisible by 5, the string is "Buzz"
         * - otherwise, the string is the number as a string
         */

        // hint: use the mapToObj() method to convert an IntStream to a Stream<String>.
        return null;
    }
}
