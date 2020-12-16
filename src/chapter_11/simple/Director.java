package chapter_11.simple;

public class Director {
    private Builder builder = new ConcreteProduct();

    public Product getAproduct(){
        builder.setPart();
        return builder.buildProduct();
    }
}
