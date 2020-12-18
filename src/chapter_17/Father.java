package chapter_17;

public class Father {
    public static void main(String[] args) {
        SchoolReport sr ;
        sr = new FatherGradeSchoolReport();
        sr = new HighScoreDectorator(sr);
        sr = new SortDecorator(sr);

        sr.report();
        sr.sign("XXX");

    }
}
