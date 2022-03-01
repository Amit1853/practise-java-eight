package udemy.lab.programming.inheritance.covariant.returns;

public class Father extends GrandFather {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
