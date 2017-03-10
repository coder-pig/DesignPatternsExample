package pull;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/3/7 0007.
 */

public abstract class OfficialAccount {
    private List<User> userList = new ArrayList<>();

    public void registerUser(User user) { userList.add(user); }

    public void unregisterUser(User user) { userList.remove(user); }

    public void notifyUse() {
        for (User user: userList) {
            user.update(this);
        }
    }
}
