import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/3/16 0016.
 */

public class Context {

    private Map<Expression, Integer> map = new HashMap<>();

    public void addExpression(Expression expression, int value) {
        map.put(expression, value);
    }

    public int lookup(Expression expression) {
        return map.get(expression);
    }

}
