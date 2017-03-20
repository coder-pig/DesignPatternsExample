/**
 * Created by Administrator on 2017/3/20 0020.
 */

public class ConstantExpression extends Expression {

    private int value;

    public ConstantExpression(int value) {
        this.value = value;
    }

    @Override public int interpret(Context context) {
        return value;
    }

    @Override public String toString() {
        return Integer.toString(value);
    }
}
