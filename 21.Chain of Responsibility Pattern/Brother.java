/**
 * Created by Administrator on 2017/3/20 0020.
 */

public class Brother extends Handler {
    @Override public void handlerRequest(String str, int money) {
        if(money <= 100) {
            System.out.println("哥哥：100块，哥哥还是有的，给你~");
        } else {
            if(getNextHandler() != null) {
                System.out.println("哥哥：大于100块，哥哥木有那么多钱，找粑粑去~");
                getNextHandler().handlerRequest(str, money);
            } else {
                System.out.println("哥哥：大于100块，哥哥木有那么多钱，粑粑不在家~");
            }
        }
    }
}
