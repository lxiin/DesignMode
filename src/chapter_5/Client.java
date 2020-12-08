package chapter_5;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Girl> list = new ArrayList<>();
        for (int i = 0; i < 20; i++){
            list.add(new Girl());
        }
        Teacher teacher = new Teacher();
        teacher.commond(new GroupLeader(list));
    }
}
