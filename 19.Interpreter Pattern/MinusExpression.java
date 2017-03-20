/**
 * Created by Administrator on 2017/3/16 0016.
 */

public class MinusExpression extends Expression{

    private Expression leftExpression;
    private Expression rightExpression;

    public MinusExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override public int interpret(Context context) {
        return leftExpression.interpret(context) - rightExpression.interpret(context);
    }

    @Override public String toString() {
        return leftExpression.toString() + " - " + rightExpression.toString();
    }
}
