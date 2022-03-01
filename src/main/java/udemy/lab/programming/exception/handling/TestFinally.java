package udemy.lab.programming.exception.handling;

public class TestFinally {

    public static void main(String[] args) {
        new TestFinally().testString();
    }

    public boolean testString() {
        try {
            String str = "A Char String";
            char c = str.charAt(20);
            return true;
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("String not that long");
            System.out.println("before return statement catch block");
            return false;
        } finally {
            System.out.println("in finally block");
        }
    }
}
