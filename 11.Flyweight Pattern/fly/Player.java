package fly;

/**
 * Created by Administrator on 2017/2/26 0026.
 */

public class Player {
    public static void main(String[] args) {
        for (int k = 0; k < 10; k ++){
            Card card = null;
            //随机花色
            switch ((int)(Math.random()*4)) {
                case 0: card = PokerFactory.getPoker(PokerFactory.Spade); break;
                case 1: card = PokerFactory.getPoker(PokerFactory.Heart); break;
                case 2: card = PokerFactory.getPoker(PokerFactory.Club); break;
                case 3: card = PokerFactory.getPoker(PokerFactory.Diamond); break;
            }
            if(card != null) {
                //随机大小
                int num = (int)(Math.random()*13 + 1);
                switch (num) {
                    case 11: card.showCard("J"); break;
                    case 12: card.showCard("Q"); break;
                    case 13: card.showCard("K"); break;
                    default: card.showCard(num+""); break;
                }
            }
        }
    }
}
