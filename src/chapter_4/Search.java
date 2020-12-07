package chapter_4;

public class Search extends AbstractSearcher {

    public Search(PrettyGirl girl) {
        super(girl);
    }

    @Override
    public void show() {
        System.out.println("------美女信息如下--------");
        super.pettyGirl.goodLooking();
        super.pettyGirl.niceFigure();
        super.pettyGirl.greatTemperament();
    }
}
