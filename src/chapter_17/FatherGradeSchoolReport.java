package chapter_17;

public class FatherGradeSchoolReport extends SchoolReport{


    @Override
    public void report() {
        System.out.println("尊敬的XXXX家长:");
        System.out.println(".............");
        System.out.println("语文85 数学 100");
        System.out.println("..........");
        System.out.println("            家长签名:           ");
    }

    public void sign() {

    }

    @Override
    public void sign(String name){
        System.out.println("家长签名为:"+name);
    }
}
