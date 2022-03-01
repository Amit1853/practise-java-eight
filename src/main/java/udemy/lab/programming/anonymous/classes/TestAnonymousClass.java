package udemy.lab.programming.anonymous.classes;

public class TestAnonymousClass {

    public void sayHello() {
        HelloWorld hello = new HelloWorld() {
            @Override
            public void greet() {
                System.out.println("Hello");
            }

            @Override
            public void greetSomeone(String name) {
                System.out.println("Hello: " + name);
            }
        };
        hello.greet();
        hello.greetSomeone("Fred");
    }

    public static void main(String[] args) {
        TestAnonymousClass testAnonymousClass = new TestAnonymousClass();
        testAnonymousClass.sayHello();
    }
}
