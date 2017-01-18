import java.util.Random;

/**
 * Created by Administrator on 2017/1/18 0018.
 */

public class Store {
    public static void main(String[] args) {
        for (int i = 0;i < 3;i++) {
            Tea tea = Me.makeTea(buyTea()); //小猪制作奶茶
        }
    }

    /* 模拟用户下单，0代表要珍珠奶茶，1代表要椰果奶茶 */
    private static int buyTea() {
        return new Random().nextInt(2);
    }
}
