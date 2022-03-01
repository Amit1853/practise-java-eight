package com.practise.comperator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Person implements Comparable {
    private String firstName;
    private String lastName;
    private int age;

    public Person() {
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        Person p = (Person) o;
        int comparedResultFirstName = this.firstName.compareTo(p.firstName);
        if (0 == comparedResultFirstName) {
            int comparedResultLastName = this.lastName.compareTo(p.lastName);
            if (comparedResultLastName == 0) {
                return this.age - p.age;
            } else {
                return comparedResultLastName;
            }
        } else {
            return comparedResultFirstName;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Avni", "Chouhan", 8));
        persons.add(new Person("Avni", "Chouhan", 7));
        persons.add(new Person("Avni", "Singh", 7));
        persons.add(new Person("Samriddhi", "chauhan", 25));
        persons.add(new Person("Bittu", "singh", 24));
        persons.add(new Person("Gattu", "Singh", 1));
        persons.add(new Person("Amit", "Chouhan", 31));
        persons.add(new Person("Abhinav", "Chouhan", 14));

        Predicate<Integer> isEven = i -> i % 2 == 0;

        Collections.sort(persons);
        persons.forEach(person -> System.out.println(person.firstName + " " + person.lastName + " " + person.age));
    }
}
