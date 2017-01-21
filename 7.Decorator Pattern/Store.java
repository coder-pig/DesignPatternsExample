/**
 * Created by Administrator on 2017/1/21 0021.
 */

public class Store {
    public static void main(String[] args) {
        Tea tea1 = new MilkTea();
        System.out.println("你点的是：" + tea1.getName() + " 价格为：" + tea1.price());

        Tea tea2 = new LemonTea();
        tea2 = new JinJu(tea2);
        System.out.println("你点的是：" + tea2.getName() + " 价格为：" + tea2.price());

        Tea tea3 = new MilkTea();
        tea3 = new ZhenZhu(tea3);
        tea3 = new YeGuo(tea3);
        tea3 = new HongDou(tea3);
        tea3 = new JinJu(tea3);
        System.out.println("你点的是：" + tea3.getName() + " 价格为：" + tea3.price());
    }
}
