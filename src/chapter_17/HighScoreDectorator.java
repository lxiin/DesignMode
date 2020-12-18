package chapter_17;

public class HighScoreDectorator extends Decorator{

    public HighScoreDectorator(SchoolReport report) {
        super(report);
    }

    private void reprotHighScore(){
        System.out.println("这次语文考试 最高是74 数学是 79");
    }

    @Override
    public void report() {
        this.reprotHighScore();
        super.report();
    }
}
