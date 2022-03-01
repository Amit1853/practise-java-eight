package udemy.lab.programming.access.modifiers;

public class DefaultModifier {
    int speedLimit = 90;

    public void run(){
        System.out.println("Running!");
    }

    public static void main(String[] args){
        DefaultModifier defaultModifier = new DefaultModifier();
        defaultModifier.speedLimit = 100;
    }
}
