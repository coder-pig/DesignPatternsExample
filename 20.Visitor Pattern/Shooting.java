/**
 * Created by Administrator on 2017/3/20 0020.
 */

public class Shooting implements Machine{

    @Override public void accept(Player player) {
        player.visit(this);
    }

    public String feature() {
        return "投篮机";
    }
}
