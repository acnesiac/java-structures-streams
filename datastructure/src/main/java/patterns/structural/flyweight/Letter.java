package patterns.structural.flyweight;


public class Letter {

    private final String value;

    public Letter(String value) {
        System.out.println("New letter created with value: "+value);
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
