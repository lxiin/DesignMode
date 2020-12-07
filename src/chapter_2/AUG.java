package chapter_2;

public class AUG extends Rifle {

    public void zoomOut(){
        System.out.println("通过望远镜察看敌人...");
    }

    @Override
    void shoot() {
        System.out.println("AUG射击");

    }
}
