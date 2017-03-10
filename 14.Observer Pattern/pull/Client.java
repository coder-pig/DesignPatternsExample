package pull;

/**
 * Created by Administrator on 2017/3/7 0007.
 */

public class Client {
    public static void main(String[] args) {
        OfficialAccount account = new CoderPig();
        User user = new AndroidDev();
        account.registerUser(user);
        ((CoderPig)account).update("《观察者模式》");
        account.unregisterUser(user);
    }
}
