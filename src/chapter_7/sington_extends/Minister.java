package chapter_7.sington_extends;

public class Minister {
    public static void main(String[] args) {
        int miniserNum = 5;
        for (int i = 0; i < miniserNum; i++){
            Emperor emperor = Emperor.getInstance();
            System.out.print("第"+(i+1)+"个大臣参拜的是:");
            emperor.say();
        }
    }
}
