package udemy.lab.programming.pass.by.value;

public class TestPassByValue {

    public static void main(String[] args){
        String name = "Dave";
        greet(name);

        System.out.println(name);
        int value = 10;

        increment(10);

        System.out.println(value);
    }

    public static void greet(String name){
        name = "Hello " + name;

        System.out.println(name);
    }

    public static void increment(int value){
        value = value + 1;
        System.out.println("Value : " + value);
    }

}
