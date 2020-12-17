package chapter_16;

public class Women implements IWomen {

    /**
     * 通过一个int类型的参数来描述妇女的个人情况
     * 1 未出嫁
     * 2 出嫁
     * 3 夫死
     * @return
     */

    private int type = 0;
    private String request = "";

    public Women(int type, String request) {
        this.type = type;
        switch (this.type){
            case 1:
                this.request = "女儿的请求是:"+request;
                break;
            case 2:
                this.request = "妻子的请求是:"+request;
                break;
            case 3:
                this.request = "目前的请求是:"+request;
                break;
        }
    }

    @Override
    public int getType() {
        return this.type;
    }

    @Override
    public String getRequest() {
        return this.request;
    }
}
