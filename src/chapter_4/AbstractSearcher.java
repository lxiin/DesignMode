package chapter_4;

public abstract class AbstractSearcher {
    protected PrettyGirl pettyGirl;

    public AbstractSearcher(PrettyGirl girl){
        this.pettyGirl = girl;
    }

    public abstract void show();
}
