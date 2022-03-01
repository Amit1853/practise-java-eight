package filters;

import model.Person;

import java.util.*;
import java.util.stream.Collectors;

public class PractiseFilters {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(new Person[]{new Person("Anjali", "Singh"), new Person("Amit", "Chouhan"),
                new Person("Sanjay", "Parihar"), new Person("Amit", "Chouhan")});

        /**
         * Filter and Set.add()
         */

        // Set<Person> repeatedFirstNamePersonTest = new HashSet<>();
        //persons.stream().filter(n -> !repeatedFirstNamePersonTest.add(n)).collect(Collectors.toSet());

        Set<Person> repeatedFirstNamePersonTest = persons.stream().filter(n -> persons.stream().filter(x -> x.equals(n)).count() > 1).collect(Collectors.toSet());
        repeatedFirstNamePersonTest.forEach(System.out::println);
        String input = "bbbcccccddddddaaaa";
        Map<Character, Long> output = input.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
        System.out.println(output);

        Map<String, Long> personStringMap = persons.stream().map(person -> person.getFirstName() + " " + person.getLastName()).collect(Collectors.groupingBy(p -> p, Collectors.counting()));
        System.out.println(personStringMap);
        Map<Person, Long> personMap = persons.stream().collect(Collectors.groupingBy(p -> p, Collectors.counting()));
        System.out.println(personMap);

        Map<Person, Long> personLongMap = persons.stream().filter(person -> Collections.frequency(persons, person) > 0).collect(Collectors.groupingBy(person -> person, Collectors.counting()));
        System.out.println(personLongMap);

        Set<Person> personSet = persons.stream().filter(person -> Collections.frequency(persons, person) > 1).collect(Collectors.toSet());
        persons.stream().forEach(person -> {
            if (personSet.contains(person)) {
                persons.remove(person);
            }
        });
        System.out.println(persons);
    }
}
