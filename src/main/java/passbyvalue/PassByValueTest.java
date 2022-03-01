package passbyvalue;

public class PassByValueTest {
    public static void main(String[] args) {
        Dog aDog = new Dog("MAX");
        Dog oldDog = aDog;

        foo(aDog);
        System.out.println("aDog.getName().equals(\"MAX\"): " + aDog.getName().equals("MAX"));
        System.out.println("aDog.getName().equals(\"FIFI\"): " + aDog.getName().equals("FIFI"));
        System.out.println(aDog == oldDog);
    }

    public static void foo(Dog d) {
        System.out.println("d.getName().equals(\"MAX\"): " + d.getName().equals("MAX"));
        d = new Dog("FIFI");
        System.out.println("d.getName().equals(\"MAX\"): " + d.getName().equals("FIFI"));
    }
}
