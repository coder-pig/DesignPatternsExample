/**
 * Created by Administrator on 2017/3/16 0016.
 */


public abstract class Expression {

    public abstract int interpret(Context context);

    @Override public abstract String toString();
}
