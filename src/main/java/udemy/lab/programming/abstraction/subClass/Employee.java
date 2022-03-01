package udemy.lab.programming.abstraction.subClass;

import udemy.lab.programming.abstraction.Person;

public abstract class Employee extends Person {
    protected String title;
    public abstract double pay();

    public String getName(){
        return title + ": " + super.firstName;
    }
}
