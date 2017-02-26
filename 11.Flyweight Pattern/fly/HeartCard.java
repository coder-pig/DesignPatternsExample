package fly;

/**
 * Created by Administrator on 2017/2/26 0026.
 */

public class HeartCard extends Card{

    public HeartCard() { super(); }

    @Override public void showCard(String num) { System.out.println("红桃：" + num); }
}
