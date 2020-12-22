package chapter_22;

public class LiSi implements Observer {
    @Override
    public void update(String context) {
        System.out.println("李斯：观察到韩非子活动，开始向老板汇报了....");
        this.reportToQinShiHUang(context);
        System.out.println("李斯：汇报完毕...");
    }

    private void reportToQinShiHUang(String reportContext){
        System.out.println("李斯：报告，韩非子活动了..."+reportContext);
    }
}
