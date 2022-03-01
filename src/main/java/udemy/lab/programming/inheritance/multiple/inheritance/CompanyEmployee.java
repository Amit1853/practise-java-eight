package udemy.lab.programming.inheritance.multiple.inheritance;

public class CompanyEmployee extends Person implements Employee {
    @Override
    public void display() {
        System.out.println("Display : Company Employee");
    }



    public static void main(String[] args) {
        Person p = new CompanyEmployee();
        p.show();
        p.display();

        Employee e = (Employee) new CompanyEmployee();
        e.show();

    }
}
