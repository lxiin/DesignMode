package chapter_14;

public class Purchase extends AbstractColleague{

    public Purchase(AbstractMeditor _mediator) {
        super(_mediator);
    }

    public void buyIBMComputer(int number){
//        Stock stock = new Stock();
//        Sale sale = new Sale();
//
//        int saleStatus = sale.getSaleStatus();
//
//        if (saleStatus > 80){
//            System.out.println("采购员IBM电脑:"+number+"台");
//            stock.increase(number);
//        }else{
//            int buyNumber = number / 2;
//            System.out.println("采购员IBM电脑:"+buyNumber+"台");
//        }
        super.meditor.execute("purchase.buy",number);
    }

    public void refuseBuyIBM(){
        System.out.println("不再采购IBM电脑");
    }

}
