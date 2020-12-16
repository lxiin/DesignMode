package chapter_12;

public class Client2 {
    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("张三");
        IGamePlayer proxy = player.getProxy();
        System.out.println("开始时间:2020年12月15日10:15:47");
        proxy.login("zhangsan","12312");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("结束时间:2020年12月15日10:16:11");

    }
}
