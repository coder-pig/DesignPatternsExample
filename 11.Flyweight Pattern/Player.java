import java.util.ArrayList;
import java.util.List;

/**
 * 描述：
 *
 * @author coder-pig： 2017/02/13 下午4:41
 */


public class Player {
    public static void main(String[] args) {
        String[] colors = new String[] {"黑桃","红心","梅花","方块"};
        List<Card> cards = new ArrayList<>();
        for(int i = 0;i < 4; i++ ) {
            for (int j = 1;j <= 13;j ++) {
                switch (j) {
                    case 11: cards.add(new Card(colors[i],"J")); break;
                    case 12: cards.add(new Card(colors[i],"Q")); break;
                    case 13: cards.add(new Card(colors[i],"K")); break;
                    default: cards.add(new Card(colors[i],j + "")); break;
                }
            }
        }
        System.out.println("扑克牌初始化完毕，共：" + cards.size() + "张");
        System.out.println("随机分5张牌：");
        for (int k = 0; k < 5; k ++){
            System.out.println(cards.get((int)(Math.random()*52)));
        }
    }
}
