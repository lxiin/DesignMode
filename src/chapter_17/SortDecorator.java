package chapter_17;

public class SortDecorator extends Decorator {

    public SortDecorator(SchoolReport report) {
        super(report);
    }

    private void reportSort(){
        System.out.println("我是排第 39 名");
    }

    @Override
    public void report() {
        this.reportSort();
        super.report();
    }
}
