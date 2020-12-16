package chapter_12.simple2;

import chapter_12.GamePlayer;
import chapter_12.IGamePlayer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("张三");
        InvocationHandler handler = new GamePlayerIH(player);
        ClassLoader cl = player.getClass().getClassLoader();
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl,new Class[]{IGamePlayer.class},handler);
        proxy.login("zhangsan","12312");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("结束时间是:2020-12-15 14:39:08");

    }
}
