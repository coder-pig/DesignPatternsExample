package push;

/**
 * Created by Administrator on 2017/3/7 0007.
 */

public class Bee implements Insect{

    private int bId;    //蜜蜂编号

    public Bee(int bId) { this.bId = bId; }

    @Override public void work() { System.out.println("蜜蜂"+ bId + "采蜜"); }

    @Override public void unWork() { System.out.println("蜜蜂"+ bId + "回巢"); }
}
