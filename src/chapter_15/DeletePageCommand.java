package chapter_15;

public class DeletePageCommand extends Command {
    @Override
    public void execute() {
        super.pg.find();
        super.rg.delete();
        super.rg.plan();
    }
}
