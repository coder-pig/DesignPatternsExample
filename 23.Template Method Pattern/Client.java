/**
 * Created by Administrator on 2017/3/21 0021.
 */

public class Client {
    public static void main(String[] args) {
        Tea tea1 = new RedTeaMilkTea();
        Tea tea2 = new GreenTeaMilkTea(false);

        tea1.make();
        System.out.println("");
        tea2.make();
    }
}
