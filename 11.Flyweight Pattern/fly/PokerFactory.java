package fly;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/2/26 0026.
 */

public class PokerFactory {

    static final int Spade = 0;  //黑桃
    static final int Heart  = 1; //红桃
    static final int Club  = 2; //梅花
    static final int Diamond  = 3;   //方块

    public static Map<Integer, Card> pokers = new HashMap<>();

    public static Card getPoker(int color) {
        if (pokers.containsKey(color)) {
            System.out.print("对象已存在，对象复用...");
            return pokers.get(color);
        } else {
            System.out.print("对象不存在，新建对象...");
            Card card;
            switch (color) {
                case Spade: card = new SpadeCard(); break;
                case Heart: card = new HeartCard(); break;
                case Club: card = new ClubCard(); break;
                case Diamond: card = new DiamondCard(); break;
                default: card = new SpadeCard(); break;
            }
            pokers.put(color,card);
            return card;
        }
    }
}
