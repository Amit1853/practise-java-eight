package com.practise.comperator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee extends Person {
    private int salary;

    public Employee() {
    }

    public Employee(String firstName, String lastName, int age, int salary) {
        super(firstName, lastName, age);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                " Person=" + super.toString() +
                '}';
    }

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Avni", "Chouhan", 8, 10000));
        employees.add(new Employee("Avni", "Chouhan", 7, 20000));
        employees.add(new Employee("Avni", "Singh", 7, 5000));
        employees.add(new Employee("Samriddhi", "chauhan", 25, 50000));
        employees.add(new Employee("Bittu", "singh", 24, 3000));
        employees.add(new Employee("Gattu", "Singh", 1, 40000));
        employees.add(new Employee("Amit", "Chouhan", 31, 100000));
        employees.add(new Employee("Abhinav", "Chouhan", 14, 2000));

        employees.sort((employee, t1) -> {
            int res = employee.salary - t1.salary;
            if (res == 0) {
                return employee.compareTo(t1);
            } else {
                return res;
            }
        });

        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee employee, Employee t1) {
                int res = employee.salary - t1.salary;
                if (res == 0) {
                    return employee.compareTo(t1);
                } else {
                    return res;
                }
            }
        });

        employees.forEach(employee -> System.out.println(employee));
    }
}
