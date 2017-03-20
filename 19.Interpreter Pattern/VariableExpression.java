/**
 * Created by Administrator on 2017/3/20 0020.
 */

public class VariableExpression extends Expression {

    private String name;

    public VariableExpression(String name) {
        this.name = name;
    }

    @Override public int interpret(Context context) {
        return context.lookup(this);
    }

    @Override public String toString() {
        return name;
    }
}
