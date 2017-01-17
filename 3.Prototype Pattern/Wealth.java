/**
 * Created by Administrator on 2017/1/16 0016.
 */

public class Wealth {
    public static void main(String[] args) {
        Assets assets1 = new Assets(100,new Money("人民币"),"现金");
        Assets assets2 = (Assets) assets1.clone();

        System.out.println("assets1.equals(assets2)：" + assets1.equals(assets2));
        System.out.println("assets1 == assets2：" + (assets1 == assets2));

        System.out.println("assets1.getClass == asset2.getClass ：" + (assets1.getClass() == assets2.getClass()));

        System.out.println("assets1.getMoney() == assets2.getMoney() ：" + (assets1.getMoney() == assets2.getMoney()));

        System.out.println("Assets1：" + assets1.toString());
        System.out.println("Assets2：" + assets2.toString());

        assets1.setAmount(200);
        System.out.println("Assets1：" + assets1.toString());
        System.out.println("Assets2：" + assets2.toString());

        assets2.getMoney().setType("美金");
        System.out.println("Assets1：" + assets1.toString());
        System.out.println("Assets2：" + assets2.toString());
    }
}
