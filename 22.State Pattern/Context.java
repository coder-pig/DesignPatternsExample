/**
 * Created by Administrator on 2017/3/21 0021.
 */

public class Context {
    public void setState(State state) {
        System.out.println("状态改变");
        state.doSomeThing();
    }
}
