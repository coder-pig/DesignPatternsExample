import java.io.*;

/**
 * Created by Administrator on 2017/1/16 0016.
 */

class AssetsS implements Serializable {

    private int amount;     //数目
    private MoneyS money;    //币种
    private String kind;    //资金种类

    AssetsS(int amount, MoneyS money, String kind) {
        System.out.println("执行了构造方法！");
        this.amount = amount;
        this.money = money;
        this.kind = kind;
    }

    public AssetsS deepClone() throws IOException, ClassNotFoundException {
        //写入当前对象的二进制流
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
        //读出二进制流产生的新对象
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (AssetsS) ois.readObject();
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public MoneyS getMoney() {
        return money;
    }

    public void setMoney(MoneyS money) {
        this.money = money;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {
        return "Assets{" + "amount=" + amount + ", money=" + money + ", kind='" + kind + '\'' + '}';
    }
}
