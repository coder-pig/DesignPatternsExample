/**
 * Created by Administrator on 2017/3/20 0020.
 */

public class Mother extends Handler {
    @Override public void handlerRequest(String str, int money) {
        if(money <= 1000) {
            System.out.println("麻麻：1000块，麻麻还是有的，给你~");
        } else {
            System.out.println("麻麻：你拿那么多钱干嘛？");
        }
    }
}
