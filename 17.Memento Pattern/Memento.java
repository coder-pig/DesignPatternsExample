/**
 * Created by Administrator on 2017/3/15 0015.
 */

public class Memento {
    private int hp;
    private int mp;
    private int money;

    public Memento(int hp, int mp, int money) {
        this.hp = hp;
        this.mp = mp;
        this.money = money;
    }

    public int getHp() {
        return hp;
    }

    public int getMp() {
        return mp;
    }

    public int getMoney() {
        return money;
    }
}
