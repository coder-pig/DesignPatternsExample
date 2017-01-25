package unuse;

/**
 * Created by Administrator on 2017/1/25 0025.
 */


class HandCake {
    private String name;
    private String desc;
    private int price;

    HandCake(String name, String desc, int price) {
        this.name = name;
        this.desc = desc;
        this.price = price;
    }

    @Override public String toString() { return " - 【手抓饼】* " + name + " 标注：" + desc + " 价格：" + price; }
}
