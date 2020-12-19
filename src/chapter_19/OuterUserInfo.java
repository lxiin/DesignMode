package chapter_19;

import java.util.Map;

public class OuterUserInfo extends OuterUser implements IUserInfo {

    private Map baseInfo = super.getUserBaseInfo();
    private Map homeInfo = super.getUserHomeInfo();
    private Map officeInfo = super.getUserOfficeInfo();


    @Override
    public String getUserName() {
        String userName = (String) baseInfo.get("userName");
        System.out.println(userName);
        return userName;
    }

    @Override
    public String getHomeAddress() {
        String homeAddress = (String) homeInfo.get("homeAddress");
        System.out.println(homeAddress);
        return homeAddress;
    }

    @Override
    public String getMobileNumber() {
        String mobileNumber = (String) baseInfo.get("mobileNumber");
        System.out.println(mobileNumber);
        return mobileNumber;
    }

    @Override
    public String getOfficeTelNumber() {
        String officeNumber = (String) officeInfo.get("officeNumber");
        System.out.println(officeNumber);
        return officeNumber;
    }

    @Override
    public String getJobPosition() {
        String jonPosition = (String) officeInfo.get("jonPosition");
        System.out.println(jonPosition);
        return jonPosition;
    }

    @Override
    public String getHomeTelNumber() {
        String homeTelNumber = (String) homeInfo.get("homeTelNumber");
        System.out.println(homeTelNumber);
        return homeTelNumber;
    }
}
