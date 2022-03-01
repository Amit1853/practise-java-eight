package udemy.lab.programming.lamdas.test.one.parameter;

public class RushableLamdaImplementation {
    public static void main(String[] args){

        Rushable rushable = amount -> {
            if(amount > 1500){
                return true;
            }else{
                return false;
            }
        };

        System.out.println(rushable.isRushable(1000));

    }
}
