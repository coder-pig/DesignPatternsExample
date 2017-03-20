/**
 * Created by Administrator on 2017/3/20 0020.
 */

public class Dancing implements Machine{

    @Override public void accept(Player player) {
        player.visit(this);
    }

    public String feature() {
        return "跳舞机";
    }
}
