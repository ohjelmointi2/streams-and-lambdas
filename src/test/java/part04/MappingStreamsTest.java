package part04;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class MappingStreamsTest {

    // the object to be tested
    private MappingStreams solution = new MappingStreams();

    @Test
    void testDoubleValuesInStream() {
        IntStream numbers = IntStream.of(1995, 2011, 2019, 2022);

        IntStream doubled = solution.doubleValuesInStream(numbers);

        assertNotNull(doubled);
        assertEquals(List.of(2 * 1995, 2 * 2011, 2 * 2019, 2 * 2022), doubled.boxed().toList());
    }

    @Test
    void testMultiplyValuesInStream() {
        IntStream numbers = IntStream.of(1995, 2011, 2019, 2022);

        IntStream tripled = solution.multiplyValuesInStream(numbers, 3);

        assertNotNull(tripled);
        assertEquals(List.of(3 * 1995, 3 * 2011, 3 * 2019, 3 * 2022), tripled.boxed().toList());
    }

    @Test
    void testMapListToIntStream() {
        List<Integer> numbers = List.of(1995, 2011, 2019, 2022);

        IntStream stream = solution.mapListToIntStream(numbers);

        assertNotNull(stream);

        // must have the same values as the original list
        assertEquals(numbers, stream.boxed().toList());
    }

    @Test
    void testPrefixAllStrings() {
        Stream<String> urls = Stream.of("ohjelmointi2.github.io", "python-ohjelmointi.github.io");
        Stream<String> prefixed = solution.prefixAllStrings(urls, "https://");

        assertNotNull(prefixed);
        assertEquals(List.of("https://ohjelmointi2.github.io", "https://python-ohjelmointi.github.io"),
                prefixed.toList());
    }

    @Test
    void testSuffixAllStrings() {
        Stream<String> files = Stream.of("foo", "bar", "baz");
        Stream<String> withExtension = solution.suffixAllStrings(files, ".txt");

        assertNotNull(withExtension);
        assertEquals(List.of("foo.txt", "bar.txt", "baz.txt"), withExtension.toList());
    }

    @Test
    void testRemoveSuffix() {
        Stream<String> files = Stream.of("foo.txt", "bar.txt", "baz.txt");
        Stream<String> removed = solution.removeSuffix(files, ".txt");

        assertNotNull(removed);
        assertEquals(List.of("foo", "bar", "baz"), removed.toList());
    }

    @Test
    void testStreamFizzBuzz() {
        IntStream numbers = IntStream.rangeClosed(1, 5);

        Stream<String> fizzBuzz = solution.streamFizzBuzz(numbers);

        assertNotNull(fizzBuzz);
        assertEquals(List.of("1", "2", "Fizz", "4", "Buzz"), fizzBuzz.toList());
    }
}
