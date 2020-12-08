package chapter_6;

public class OffNovelBook extends NovelBook {

    public OffNovelBook(String name, int price, String author) {
        super(name, price, author);
    }

    @Override
    public int getPrice() {
        int selfPrice = super.getPrice();
        int offPrice = 0;
        if (selfPrice > 4000){
            offPrice = selfPrice * 90 / 100;
        }else{
            offPrice= selfPrice * 80 / 100;
        }
        return offPrice;
    }
}
