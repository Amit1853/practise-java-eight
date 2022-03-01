package udemy.lab.programming.inheritance.covariant.returns;

public class FatherRegistry extends GrandFatherRegistry {

    public Father whosMyAncestor() {
        Father father = new Father();
        father.setType("Father");
        return father;
    }
}
