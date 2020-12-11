package chapter_8.simple;

public abstract class Creator {
    public abstract <T extends Product> T createProduct(Class<T> c);
}
