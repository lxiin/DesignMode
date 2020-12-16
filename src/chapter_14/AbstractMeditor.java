package chapter_14;

public abstract class AbstractMeditor {

    protected Purchase purchase;
    protected Sale sale;
    protected Stock stock;

    public AbstractMeditor(){
        purchase = new Purchase(this);
        sale = new Sale(this);
        stock = new Stock(this);
    }

    public abstract void execute(String str,Object... objects);

}
