package chapter_21;

import chapter_18.BackDoor;

import java.util.ArrayList;

public class Client {

    public static void main(String[] args) {
        IRoot ceo = new Root("王大麻子","总经理",100000);
        IBranch develop = new Branch("刘大瘸子","研发经理",10000);
        IBranch salesDep = new Branch("马尔拐子","销售经理",9000);
        IBranch fianceDep = new Branch("赵三驼子","财务经理",9000);

        IBranch firstDevGrop = new Branch("杨三也写","开发一组组长",8000);
        IBranch secondDevGroup = new Branch("五大棒槌","开发二组组长",82000);
        ILeaf a = new Leaf("a","开发人员",4000);
        ILeaf b = new Leaf("b","开发人员2",4000);
        ILeaf c = new Leaf("c","开发人员3",4000);
        ILeaf d = new Leaf("d","开发人员",4000);
        ILeaf e = new Leaf("e","销售人员",3000);
        ILeaf f = new Leaf("f","销售人员",4000);
        ILeaf g = new Leaf("g","销售人员",5000);
        ILeaf h = new Leaf("h","财务人员",4000);
        ILeaf i = new Leaf("i","财务人员",4000);
        ILeaf j = new Leaf("j","CEO秘书",5000);

        ILeaf zhengLaoLiu = new Leaf("郑老六","研发副总",20000);
        ceo.add(develop);
        ceo.add(salesDep);
        ceo.add(fianceDep);
        ceo.add(j);
        develop.add(firstDevGrop);
        develop.add(secondDevGroup);
        develop.add(zhengLaoLiu);

        firstDevGrop.add(a);
        firstDevGrop.add(b);
        secondDevGroup.add(c);
        secondDevGroup.add(d);
        salesDep.add(e);
        salesDep.add(f);
        salesDep.add(g);
        fianceDep.add(h);
        fianceDep.add(i);

        System.out.println(ceo.getInfo());
        getAllSubordinateInfo(ceo.getSubordinateInfo());

    }

    private static void getAllSubordinateInfo(ArrayList subordinateInfo) {
        int length = subordinateInfo.size();
        for (int m = 0; m < length; m++){
            Object s = subordinateInfo.get(m);
            if (s instanceof Leaf){
                System.out.println(((Leaf) s).getInfo());
            }else{
                IBranch branch = (IBranch) s;
                System.out.println(branch.getInfo());
                getAllSubordinateInfo(branch.getSubordinateInfo());
            }
        }
    }
}
