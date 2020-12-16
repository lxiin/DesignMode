package chapter_11.simple;

public class ConcreteProduct extends Builder{

    private Product product = new Product();

    @Override
    public void setPart() {

    }

    @Override
    public Product buildProduct() {
        return product;
    }
}
