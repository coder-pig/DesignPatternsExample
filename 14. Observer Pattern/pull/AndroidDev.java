package pull;

/**
 * Created by Administrator on 2017/3/7 0007.
 */

public class AndroidDev implements User {
    @Override public void update(OfficialAccount account) {
        System.out.println("读者查看公众号更新信息：" +  ((CoderPig)account).getMsg());
    }
}
