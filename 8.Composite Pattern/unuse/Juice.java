package unuse;

/**
 * Created by Administrator on 2017/1/25 0025.
 */

class Juice {
    private String name;
    private String desc;
    private int price;

    Juice(String name, String desc, int price) {
        this.name = name;
        this.desc = desc;
        this.price = price;
    }

    @Override public String toString() { return " - 【果汁】* " + name + " 标注：" + desc + " 价格：" + price;}
}
