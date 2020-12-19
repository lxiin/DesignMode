package chapter_19;

public class UserInfo implements IUserInfo {
    @Override
    public String getUserName() {
        System.out.println("名字叫做.....");
        return null;
    }

    @Override
    public String getHomeAddress() {
        System.out.println("家庭住址是......");
        return null;
    }

    @Override
    public String getMobileNumber() {
        System.out.println("手机号码是......");
        return null;
    }

    @Override
    public String getOfficeTelNumber() {
        System.out.println("办公室电话是.....");
        return null;
    }

    @Override
    public String getJobPosition() {
        System.out.println("这个人的职称是.....");
        return null;
    }

    @Override
    public String getHomeTelNumber() {
        System.out.println("这个人的家庭电话是.....");
        return null;
    }
}
