package chapter_14;

public abstract class AbstractColleague {
    protected AbstractMeditor meditor;

    public AbstractColleague(AbstractMeditor _mediator){
        this.meditor = _mediator;
    }
}
