package udemy.lab.programming.Final.keyword.method;

class Bike{
    public final void run(){
        System.out.println("Running!");
    }
}

public class Honda extends Bike{
    /*public void run(){
        System.out.println("Honda Running");
    }*/
    public static void main(String[] args){
        Honda honda = new Honda();
        honda.run();
    }
}
