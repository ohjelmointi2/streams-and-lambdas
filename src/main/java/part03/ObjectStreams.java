package part03;

import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class ObjectStreams {

    record Product(String name, double price) {
    }

    private final List<Product> products = List.of(new Product("foo", 1), new Product("foo", 2), new Product("foo", 3));

    /**
     * Create a stream from the `products` list and return it.
     *
     * @return
     */
    public Stream<Product> streamProducts() {
        return products.stream();
    }

    /**
     * Use `filter` to only include products that have a lower or equal price than
     * given.
     *
     * @param limit
     * @return
     */
    public Stream<Product> streamInexpensiveProducts(double limit) {
        return streamProducts().filter(p -> p.price <= limit);
    }

    /**
     * Use `map` to create a new stream with just the name of each product.
     */
    public Stream<String> streamProductNames() {
        return streamProducts().map(p -> p.name);
    }

    /**
     * Use `mapToDouble` to create a new stream with just the price of each product.
     */
    public DoubleStream streamPrices() {
        return streamProducts().mapToDouble(p -> p.price);
    }
}
