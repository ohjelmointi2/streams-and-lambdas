package part08;

import java.util.stream.Stream;

import person.Person;

/**
 * This class concludes our exercises by applying the concepts of previous
 * exercises with to Person objects. Person objects can be filtered, mapped and
 * collected just like any other objects.
 */
public class PersonStreams {

    /**
     * Returns a stream of the adults in the specified stream of persons.
     * An adult is a person whose age is 18 or over.
     *
     * @param persons the stream of persons
     * @return a stream of the adults in the specified stream
     */
    public Stream<Person> getAdults(Stream<Person> persons) {
        // Hint: you can call the `age()` method on a Person object to get the age.
        return persons.filter(p -> p.age() >= 18);
    }

    /**
     * Returns a stream of new Person objects that have the same names as the
     * persons in the specified stream but their ages are incremented by one.
     *
     * @param persons the stream of persons
     * @return a stream of new Person objects with incremented ages
     */
    public Stream<Person> incrementAge(Stream<Person> persons) {
        /*
         * Hint: you cannot modify the age of the persons in the original stream, you
         * need to create new Person objects. Use the `map()` method to create new
         * stream and the `Person` constructor to create new Person objects.
         * The name and age of a Person object can be accessed using the `name()` and
         * `age()` methods.
         */
        return persons.map(p -> new Person(p.name(), p.age() + 1));
    }

    /**
     * Returns a stream of People objects that have been created based on the lines
     * in the specified stream. Each line contains the name and age of a person
     * separated by a comma. For example, the line "Ada,20" creates a Person object
     * with the name "Ada" and the age 20.
     *
     * @param csvLines the stream of lines from a CSV file
     * @return a stream of Person objects
     */
    public Stream<Person> csvToPersons(Stream<String> csvLines) {
        return csvLines.map(line -> {
            String[] parts = line.split(",");
            return new Person(parts[0], Integer.parseInt(parts[1]));
        });
    }
}
