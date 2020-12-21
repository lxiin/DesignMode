package chapter_20;

import java.util.ArrayList;

public class Project implements IProject {

    private ArrayList<IProject> projectList = new ArrayList<>();

    private String name = "";

    private int num = 0;

    private int cost = 0;

    public Project(String name, int num, int cost) {
        this.name = name;
        this.num = num;
        this.cost = cost;
    }


    public Project() {
    }

    @Override
    public String getProjectInfo() {
        String info = "";
        info = info + "项目名称:"+this.name;
        info = info + "\t项目人数:"+this.num;
        info = info + "\t项目费用:"+this.cost;
        return info;
    }

    @Override
    public void add(String name, int num, int cost) {
        projectList.add(new Project(name,num,cost));
    }

    @Override
    public IProjectIterator iterator() {
        return new ProjectIterator(this.projectList);
    }
}
