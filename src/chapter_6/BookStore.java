package chapter_6;

import java.text.NumberFormat;
import java.util.ArrayList;

public class BookStore {
    private final static ArrayList<IBook> bookList = new ArrayList<>();

    static {
        bookList.add(new OffNovelBook("AAAA",3200,"A"));
        bookList.add(new OffNovelBook("BBBB",5600,"B"));
        bookList.add(new OffNovelBook("CCCC",3500,"C"));
        bookList.add(new OffNovelBook("DDDD",4300,"D"));
    }

    public static void main(String[] args) {
        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        numberFormat.setMaximumIntegerDigits(2);
        System.out.println("----------书店卖出去的数据记录如下:-----------");
        for (IBook book : bookList){
            System.out.println("书籍名称:"+book.getAuthor()+"\t数据作者:"+book.getAuthor()+"\t书籍价格:"
                    +numberFormat.format(book.getPrice()/100.0)+"元");
        }
    }
}
