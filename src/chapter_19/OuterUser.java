package chapter_19;

import java.util.HashMap;
import java.util.Map;

public class OuterUser implements IOuterUser{
    @Override
    public Map getUserBaseInfo() {
        HashMap baseInfoMap = new HashMap();
        baseInfoMap.put("userName","这个员工名字是....");
        baseInfoMap.put("mobileNumber","这个员工的手机号是....");
        return null;
    }

    @Override
    public Map getUserOfficeInfo() {
        HashMap officeInfo = new HashMap();
        officeInfo.put("jonPosition","这个人的职称是.....");
        officeInfo.put("officeNumber","这个员工的办公电话是...");
        return null;
    }

    @Override
    public Map getUserHomeInfo() {
        HashMap homeInfo = new HashMap();
        homeInfo.put("homeTelNumber","这个员工的家庭电话是.....");
        homeInfo.put("homeAddress","这个员工的家庭住址是...");
        return null;
    }
}
