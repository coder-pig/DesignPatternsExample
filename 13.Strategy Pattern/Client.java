/**
 * Created by Administrator on 2017/3/6 0006.
 */

public class Client {
    public static void main(String[] args) {
        Context context = new Context();

        context.setCompute(new Add());
        context.calc(1,2);

        context.setCompute(new Sub());
        context.calc(3,4);

        context.setCompute(new Mul());
        context.calc(5,6);

        context.setCompute(new Div());
        context.calc(7,8);
    }
}
