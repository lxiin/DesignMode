package chapter_14;

public class Stock extends AbstractColleague {

    private static int COMPUTER_NUMBER = 100;

    public Stock(AbstractMeditor _mediator) {
        super(_mediator);
    }

    public void increase(int number){
        COMPUTER_NUMBER = COMPUTER_NUMBER + number;
        System.out.println("库存数量为:"+COMPUTER_NUMBER);
    }

    public void decrease(int number){
        COMPUTER_NUMBER = COMPUTER_NUMBER - number;
        System.out.println("库存数量为:"+COMPUTER_NUMBER);
    }

    public int getStockNumber(){
        return COMPUTER_NUMBER;
    }


    public void clearStock(){
//        Purchase purchase = new Purchase();
//        Sale sale = new Sale();
//        System.out.println("清理存货数量为:"+COMPUTER_NUMBER);
//        sale.offSale();
//        purchase.refuseBuyIBM();
        super.meditor.execute("stock.clear");
    }

}
