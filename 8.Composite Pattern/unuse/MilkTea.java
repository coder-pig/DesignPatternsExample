package unuse;

/**
 * Created by Administrator on 2017/1/25 0025.
 */

class MilkTea {
    private String name;
    private String desc;
    private int price;

    MilkTea(String name, String desc, int price) {
        this.name = name;
        this.desc = desc;
        this.price = price;
    }

    @Override public String toString() { return " - 【奶茶】* " + name + " 标注：" + desc + " 价格：" + price; }
}
