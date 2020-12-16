package chapter_14;

public class Client {

    public static void main(String[] args) {
        AbstractMeditor meditor = new Mediator();
        System.out.println("----------采购人员采购电脑-----------");
        Purchase purchase = new Purchase(meditor);
        purchase.buyIBMComputer(100);
        System.out.println("-----------销售人员销售电脑----------");
        Sale sale = new Sale(meditor);
        sale.sellIBMComputer(1);
        System.out.println("============库房管理人员清库处理==========");
        Stock stock = new Stock(meditor);
        stock.clearStock();
    }

}
