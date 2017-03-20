/**
 * Created by Administrator on 2017/3/20 0020.
 */

public class Father extends Handler {
    @Override public void handlerRequest(String str, int money) {
        if(money <= 500) {
            System.out.println("粑粑：500块，粑粑还是有的，给你~");
        } else {
            if(getNextHandler() != null) {
                System.out.println("粑粑：大于500块，粑粑木有那么多钱，找麻麻去~");
                getNextHandler().handlerRequest(str, money);
            } else {
                System.out.println("粑粑：大于500块，粑粑木有那么多钱，麻麻不在家~");
            }
        }
    }
}
