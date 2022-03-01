package udemy.lab.programming.inheritance;

public class Employee extends Person {
    private int salary;

    public Employee(String firstName, String lastName, int salary){
        super(firstName, lastName);
        this.salary = salary;
    }

    public Employee(){
        this.salary = 20000;
    }

    public void promote(int percent){
        this.salary *= 1 + (percent/100);
    }

    public void display(){
        System.out.println("I am Employee");
    }

    public void show(){
        System.out.println("Show Method Employee");
    }
    public static void main(String[] args){
        Person p = new Employee();
        p.display();

        Employee e = (Employee) new Person();
        e.show();
    }
}
