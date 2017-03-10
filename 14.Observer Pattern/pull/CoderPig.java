package pull;

/**
 * Created by Administrator on 2017/3/7 0007.
 */


public class CoderPig extends OfficialAccount {
    private String msg; //更新的文章

    public String getMsg() {
        return msg;
    }

    public void update(String msg) {
        this.msg = msg;
        System.out.println("公众号更新了文章：" + msg);
        this.notifyUse();   //通知用户有更新
    }
}
