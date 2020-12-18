package chapter_17;

public class SugarFouthGradSchoolReport extends FatherGradeSchoolReport{

    private void reprotHighScore(){
        System.out.println("这次语文考试 最高是74 数学是 79");
    }

    private void reportSort(){
        System.out.println("我是排第 39 名");
    }

    @Override
    public void report() {
        this.reprotHighScore();
        super.report();
        this.reportSort();
    }
}
