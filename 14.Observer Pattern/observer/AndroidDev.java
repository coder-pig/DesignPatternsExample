package observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Administrator on 2017/3/7 0007.
 */


public class AndroidDev implements Observer{
    @Override public void update(Observable o, Object object) {
        System.out.println("收到公众号更新信息：" + object);
    }
}
