package udemy.lab.programming.inheritance;

public class Person {
    private String firstName;
    private String lastName;

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person() {
        this("John", "Doe");
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

    public void display() {
        System.out.println("I am Person");
    }

}
