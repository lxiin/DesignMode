package chapter_18;

public class GivenGreenLight implements IStrategy{
    @Override
    public void operate() {
        System.out.println("求吴国太开绿灯，放行！");
    }
}
