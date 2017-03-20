/**
 * Created by Administrator on 2017/3/20 0020.
 */


public abstract class Handler {
    /* 下家处理者 */
    private Handler nextHandler;

    public Handler getNextHandler() {
        return  nextHandler;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /* 请求 */
    public abstract void handlerRequest(String str, int money);

}
