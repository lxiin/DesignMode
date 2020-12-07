package chapter_2;

public class Soldier {
    private AbstractGun gun;

    public void setGun(AbstractGun gun) {
        this.gun = gun;
    }

    public void killEnemy(){
        System.out.println("士兵开始杀人了...");
        gun.shoot();
    }
}
