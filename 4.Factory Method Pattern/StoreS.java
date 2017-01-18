import java.util.Random;

/**
 * Created by Administrator on 2017/1/18 0018.
 */

public class StoreS {
    public static void main(String[] args) {
        //初始化两个小弟
        ZhenZhuMakeTea zhenzhu = new ZhenZhuMakeTea();
        YeGuoMakeTea yeguo = new YeGuoMakeTea();

        for (int i = 0;i < 3;i++) {
            Tea tea = buyTea() == 0 ? zhenzhu.小猪带特效的奶茶制作工艺() : yeguo.小猪带特效的奶茶制作工艺();
        }
    }

    /* 模拟用户下单，0代表要珍珠奶茶，1代表要椰果奶茶 */
    private static int buyTea() {
        return new Random().nextInt(2);
    }
}
