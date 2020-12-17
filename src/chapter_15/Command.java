package chapter_15;

public abstract class Command {

    protected RequireGroup rg = new RequireGroup();
    protected PageGroup pg = new PageGroup();
    protected CodeGroup cg = new CodeGroup();

    public abstract void execute();



}
