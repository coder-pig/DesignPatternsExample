package unbridge;

import java.util.Date;

/**
 * 描述：
 *
 * @author coder-pig： 2017/02/05 上午11:09
 */

public class Restaurant {
    public static void main(String[] args) {
        System.out.println("\n" + new Date(System.currentTimeMillis()));
        System.out.println("==================");

        Steak steak1 = new BeefSteak();
        steak1.sale();

        Steak steak2 = new PorkSteakRice();
        steak2.sale();

        Steak steak3 = new BeefSteakSpaghetti();
        steak3.sale();

        Steak steak4 = new ChickenSteakRice();
        steak4.sale();



        System.out.println("==================");
    }
}
