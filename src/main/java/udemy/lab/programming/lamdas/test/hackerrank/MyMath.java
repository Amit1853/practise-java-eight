package udemy.lab.programming.lamdas.test.hackerrank;

public class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        p = a -> {
            if (a % 2 == 0) {
                return true;
            } else {
                return false;
            }
        };
        return p.check(num);
    }

    public static void main(String[] args) {
        PerformOperation p = null;
        checker(p, 4);
    }
}
