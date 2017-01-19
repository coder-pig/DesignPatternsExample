import java.util.Random;

/**
 * Created by Administrator on 2017/1/18 0018.
 */

public class Store {
    public static void main(String[] args) {
        //初始化两个小弟
        MakeFood xiaodi1 = new FirstXiaoDi();
        MakeFood xiaodi2 = new SecondXiaoDi();

        for(int i = 0;i < 4 ;i++) {
            System.out.println("====== 根据订单配餐： ======");
            Drink drink = buyDrink() == 0 ? xiaodi1.createMakeDrink() : xiaodi2.createMakeDrink();
            Snack snack = buySnack() == 0 ? xiaodi1.createMakeSnack() : xiaodi2.createMakeSnack();
            drink.drink();
            snack.snack();
        }
    }

    /* 模拟用户点饮料，0代表要奶茶，1代表要果汁 */
    private static int buyDrink() {
        return new Random().nextInt(2);
    }

    /* 模拟用户点小吃，0代表要手抓饼，1代表要鱼蛋 */
    private static int buySnack() {
        return new Random().nextInt(2);
    }
}
