package chapter_20;

public interface IProject {
    String getProjectInfo();

    void add(String name,int num,int cost);

    IProjectIterator iterator();

}
