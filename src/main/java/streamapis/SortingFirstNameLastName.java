package streamapis;

import model.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingFirstNameLastName {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(new Person[]{new Person("Anjali", "Singh"), new Person("Amit", "Chouhann"),
                new Person("Sanjay", "Parihar"), new Person("Amit", "Chauhan")});

        /*****************************************************
         Sort person by firstName
         *****************************************************/

        persons.stream().sorted(Comparator.comparing(Person::getFirstName)).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("--------------------");
        /*****************************************************
         Sort person by firstName and then lastName
         *****************************************************/
        persons.stream().sorted(Comparator.comparing(Person::getFirstName).thenComparing(Person::getLastName)).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("--------------------");
        /*****************************************************
         Sort person by lastName and then firstName
         *****************************************************/
        persons.stream().sorted(Comparator.comparing(Person::getLastName).thenComparing(Person::getFirstName)).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("--------------------");

        /*****************************************************
         Sort person by number of characters in firstName and lastName
         ****************************************************/
        persons.stream().map(person -> new StringBuilder().append(person.getFirstName()).append(" ").append(person.getLastName()).append(" ").append(person.getFirstName().length() + person.getLastName().length()))
                .sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);

        /*****************************************************
         Sort person by number of characters in firstName
         ****************************************************/

        persons.stream().reduce((p1, p2) -> (p1.getFirstName().length() + p1.getLastName().length()) > (p2.getFirstName().length() + p2.getLastName().length()) ? p1 : p2)
                .ifPresent(System.out::println);

    }
}
