package chapter_20;

import java.util.ArrayList;

public class Boss {
    public static void main(String[] args) {

        IProject project = new Project();


//        ArrayList<IProject> projectList = new ArrayList<>();
        project.add("星球大战项目",10,10000);
        project.add("扭转时空项目",100,100000);
        project.add("超人改造项目",10000,100000);
//
        for (int i = 5; i < 105; i++) {
            project.add("第"+i+"个项目",i*5,i*10000);
        }

        IProjectIterator projectIterator = project.iterator();
        while (projectIterator.hasNext()){
            IProject p = (IProject) projectIterator.next();
            System.out.println(p.getProjectInfo());
        }


//        for (IProject project : projectList){
//            System.out.println(project.getProjectInfo());
//        }
    }
}
