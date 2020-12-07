package chapter_4;

public class Client {
    public static void main(String[] args) {
        PrettyGirl pettyGirl = new PrettyGirl("AAA");
        AbstractSearcher searcher = new Search(pettyGirl);
        searcher.show();
    }
}
