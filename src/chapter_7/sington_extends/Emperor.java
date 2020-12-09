package chapter_7.sington_extends;

import java.util.ArrayList;
import java.util.Random;

public class Emperor {
    private static int maxNumOfEmperor = 2;
    private static ArrayList<String> nameList = new ArrayList<>();

    private static ArrayList<Emperor> emperorList = new ArrayList<>();

    private static int countNumOfEmpror = 0;

    static {
        for (int i = 0; i < maxNumOfEmperor; i++){
            emperorList.add(new Emperor("皇"+(i+1)+"帝"));
        }
    }

    private Emperor(){

    }

    private Emperor(String name){
        nameList.add(name);
    }

    public static Emperor getInstance(){
        Random random = new Random();
        countNumOfEmpror = random.nextInt(maxNumOfEmperor);
        return emperorList.get(countNumOfEmpror);
    }

    public static void say(){
        System.out.println(nameList.get(countNumOfEmpror));
    }
}
