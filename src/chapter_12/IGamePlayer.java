package chapter_12;

public interface IGamePlayer {
    void login(String userName,String password);
    void killBoss();
    void upgrade();
    public IGamePlayer getProxy();
}
