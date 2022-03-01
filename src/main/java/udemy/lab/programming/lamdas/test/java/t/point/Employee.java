package udemy.lab.programming.lamdas.test.java.t.point;

import java.util.Arrays;
import java.util.List;

public class Employee {
    private int salary;
    private Person p;

    public Person getP() {
        return p;
    }

    public void setP(Person p) {
        this.p = p;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee() {
        //default interface
    }

    public Employee(int salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee e = new Employee(10000);
        e.setP((salutation, nameList) -> {
            StringBuilder builder = new StringBuilder();
            builder.append(salutation);
            nameList.forEach(s -> {
                builder.append(" ").append(s);
            });

            return builder.toString();
        });
        /*Person p = ((salutation, nameList) -> {
            StringBuilder builder = new StringBuilder();

            builder.append(salutation);
            nameList.forEach(names -> {
                builder.append(" ");
                builder.append(names);
            });
            return builder.toString();
        });*/
        System.out.println("Employee name is : " + e.getP().getName("Mr.", Arrays.asList(new String[]{"Amit", "Chouhan"})) + " and Salary is : " + e.getSalary());
    }
}
