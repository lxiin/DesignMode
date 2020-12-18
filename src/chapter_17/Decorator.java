package chapter_17;

public abstract class Decorator extends SchoolReport{

    private SchoolReport sr;
    public Decorator(SchoolReport report){
        this.sr = report;
    }

    @Override
    public void report() {
        this.sr.report();
    }

    @Override
    public void sign(String name) {
        this.sr.sign(name);
    }
}
