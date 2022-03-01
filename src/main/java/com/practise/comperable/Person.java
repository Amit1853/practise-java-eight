package com.practise.comperable;

import java.time.LocalDate;
import java.util.Objects;

public class Person implements Comparable {
    private String firstName;
    private String lastName;
    private LocalDate dob;

    public Person() {
    }

    public Person(String firstName, String lastName, LocalDate dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public int compareTo(Object o) {
        Person p = (Person) o;
        int comparedFirstName = this.firstName.compareTo(p.firstName);
        if (comparedFirstName == 0) {
            int comparedLastName = this.lastName.compareTo(p.lastName);
            if (comparedLastName == 0) {
                return this.dob.compareTo(p.dob);
            }
            return comparedLastName;
        }
        return comparedFirstName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(dob, person.dob);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, dob);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob=" + dob +
                '}';
    }
}
