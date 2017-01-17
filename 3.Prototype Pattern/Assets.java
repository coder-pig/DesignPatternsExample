/**
 * Created by Administrator on 2017/1/16 0016.
 */

class Assets implements Cloneable{

    private int amount;     //数目
    private Money money;    //币种
    private String kind;    //资金种类

    Assets(int amount, Money money, String kind) {
        System.out.println("执行了构造方法！");
        this.amount = amount;
        this.money = money;
        this.kind = kind;
    }

    @Override
    protected Object clone() {
        Assets assets = null;
        try {
            assets = (Assets) super.clone();
            assets.setMoney((Money) this.getMoney().clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return assets;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Money getMoney() {
        return money;
    }

    public void setMoney(Money money) {
        this.money = money;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override public String toString() {return "Assets{" + "amount=" + amount + ", money=" + money + ", kind='" + kind + '\'' + '}';}
}
