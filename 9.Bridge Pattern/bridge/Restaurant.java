package bridge;

import java.util.Date;

/**
 * 描述：
 *
 * @author coder-pig： 2017/02/05 下午2:18
 */

public class Restaurant {
    public static void main(String[] args) {
        System.out.println("\n" + new Date(System.currentTimeMillis()));
        System.out.println("==================");

        Steak steak1 = new BeefSteak(new Rice());
        System.out.println("卖出了一份：" + steak1.sale());

        Steak steak2 = new PorkSteak(new Spaghetti());
        System.out.println("卖出了一份：" + steak2.sale());

        Steak steak3 = new PorkSteak(null);
        System.out.println("卖出了一份：" + steak3.sale());

        Steak steak4 = new ChickenSteak(new Rice());
        System.out.println("卖出了一份：" + steak4.sale());

        Steak steak5 = new LambSteak(new Spaghetti());
        System.out.println("卖出了一份：" + steak5.sale());

        Sauces sauces1 = new FanQieSauces(new PorkSteak(new Rice()));
        System.out.println("卖出了一份：" + sauces1.sauces());

        Sauces sauces2 = new HeiJiaoSauces(new BeefSteak(new Spaghetti()));
        System.out.println("卖出了一份：" + sauces2.sauces());

        Sauces sauces3 = new XiangCaoSauces(new ChickenSteak(null));
        System.out.println("卖出了一份：" + sauces3.sauces());


        System.out.println("==================");
    }
}
