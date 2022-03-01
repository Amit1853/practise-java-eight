package com.practise.comperable;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Employee extends Person implements Comparable {

    private LocalDate joiningDate;
    private int salary;

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee() {
    }

    public Employee(String firstName, String lastName, LocalDate dob, LocalDate joiningDate, int salary) {
        super(firstName, lastName, dob);
        this.joiningDate = joiningDate;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                "Joining Date" + joiningDate.toString() +
                " Person=" + super.toString() +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Employee e = (Employee) o;
        int comparedSalary = e.salary - this.salary;
        if (comparedSalary == 0) {
            int comparedJoiningDate = e.joiningDate.compareTo(this.joiningDate);
            if (comparedJoiningDate == 0) {
                return super.compareTo(o);
            } else {
                return comparedJoiningDate;
            }
        } else {
            return comparedSalary;
        }
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Avni", "Chouhan",
                LocalDate.of(1990, 10, 18),
                LocalDate.of(2018, 02, 26), 10000));
        employees.add(new Employee("Avni", "Chouhan", LocalDate.now().minusYears(10), LocalDate.now().minusYears(2), 20000));
        employees.add(new Employee("Avni", "Singh", LocalDate.now().minusYears(20), LocalDate.now().minusYears(1), 5000));
        employees.add(new Employee("Samriddhi", "chauhan", LocalDate.now().minusYears(30), LocalDate.now().minusYears(3), 50000));


        employees.stream().sorted(Comparator.comparing(Employee::getDob, (s1, s2) -> {
            return s1.compareTo(s2);
        }));
        employees.forEach(e -> System.out.println(e));
    }
}
