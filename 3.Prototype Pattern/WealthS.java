import java.io.IOException;

/**
 * Created by Administrator on 2017/1/16 0016.
 */

public class WealthS {
    public static void main(String[] args) {
        AssetsS assetsS1 = new AssetsS(100,new MoneyS("人民币"),"现金");
        try {
            AssetsS assetsS2 = assetsS1.deepClone();    //序列化深克隆
            //...其他代码
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
