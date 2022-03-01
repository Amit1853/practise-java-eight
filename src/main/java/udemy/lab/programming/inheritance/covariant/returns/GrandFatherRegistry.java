package udemy.lab.programming.inheritance.covariant.returns;

public class GrandFatherRegistry {

    public GrandFather whosMyAncestor(){
        GrandFather grandFather = new GrandFather();
        grandFather.setType("GrandFather");
        return grandFather;
    }
}
