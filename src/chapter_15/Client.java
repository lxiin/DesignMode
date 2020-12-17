package chapter_15;

public class Client {
    public static void main(String[] args) {
        System.out.println("-------客户要求增加一项需求------");
        Group rg = new RequireGroup();
        rg.find();
        rg.add();
        rg.plan();

        System.out.println("-------客户要求删除一个页面------");
        Group pg = new PageGroup();
        pg.find();
        pg.delete();
        pg.plan();

    }
}
