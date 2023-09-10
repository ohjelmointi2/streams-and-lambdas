package part01;

import java.util.stream.IntStream;

public class NumericStreams {

    public IntStream numbersBetween(int from, int to) {
        return IntStream.rangeClosed(from, to);
    }

    public IntStream evenNumbersBetween(int from, int to) {
        return numbersBetween(from, to).map(n -> n * 2);
    }

    public IntStream oddNumbersBetween(int from, int to) {
        return numbersBetween(from, to).map(n -> n * 2 + 1);
    }
}
