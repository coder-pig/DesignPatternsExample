/**
 * Created by Administrator on 2017/3/15 0015.
 */

public class Character {
    private int hp;
    private int mp;
    private int money;

    public Character(int hp, int mp, int money) {
        this.hp = hp;
        this.mp = mp;
        this.money = money;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void showMsg() {
        System.out.println("当前状态：| HP：" + hp + " | MP：" + mp + " | 金钱：" + money + "\n");
    }

    //创建一个备忘录，保存当前自身状态
    public Memento save() {
        return new Memento(hp, mp, money);
    }

    //传入一个备忘录对象，恢复内部状态
    public void restore(Memento memento) {
        this.hp = memento.getHp();
        this.mp = memento.getMp();
        this.money = memento.getMoney();
    }
}
