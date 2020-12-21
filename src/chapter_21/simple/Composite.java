package chapter_21.simple;

import java.util.ArrayList;

public class Composite extends Component {

    private ArrayList<Component> componentArrayList = new ArrayList<>();

    public void add(Component component){
        this.componentArrayList.add(component);
    }

    public void remove(Component component){
        this.componentArrayList.remove(component);
    }

    public ArrayList<Component> getChildren(){
        return this.componentArrayList;
    }

}
