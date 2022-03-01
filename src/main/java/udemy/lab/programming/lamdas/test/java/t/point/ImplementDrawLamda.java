package udemy.lab.programming.lamdas.test.java.t.point;

public class ImplementDrawLamda {

    public static void main(String[] args) {

        Drawable d = (name) -> {
            return ("Drawing : " + name);
        };
       String str = d.draw("Circle");
        System.out.println(str);

    }
}
