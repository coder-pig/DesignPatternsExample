/**
 * Created by Administrator on 2017/3/20 0020.
 */

public class FemalePlayer implements Player{

    @Override public void visit(Shooting machine) {
        System.out.println("女性玩家玩：" + machine.feature());
    }

    @Override public void visit(Dancing machine) {
        System.out.println("女性玩家玩：" + machine.feature());
    }

    @Override public void visit(Driving machine) {
        System.out.println("女性玩家玩：" + machine.feature());
    }
}
