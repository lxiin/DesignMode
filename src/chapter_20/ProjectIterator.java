package chapter_20;

import java.util.ArrayList;

public class ProjectIterator implements IProjectIterator {

    private ArrayList<IProject> projectList = new ArrayList<>();

    private int currentNum = 0;

    public ProjectIterator(ArrayList<IProject> projectList) {
        this.projectList = projectList;
    }

    @Override
    public boolean hasNext() {
        boolean b = true;

        if (this.currentNum > projectList.size() || this.projectList.get(this.currentNum) == null){
            b = false;
        }
        return b;
    }

    @Override
    public IProject next() {
        return this.projectList.get(this.currentNum++);
    }
}
