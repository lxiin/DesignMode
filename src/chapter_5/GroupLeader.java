package chapter_5;

import java.util.List;

public class GroupLeader {

    private List<Girl> listGirls;
    public GroupLeader(List<Girl> _listGirls){
        listGirls = _listGirls;
    }

    public void countGirls(){
        System.out.println("女生的数量是:"+this.listGirls.size());
    }
}
