package use;

/**
 * Created by Administrator on 2017/1/25 0025.
 */

class MilkTea extends AbstractMenu {
    private String name;
    private String desc;
    private int price;

    MilkTea(String name, String desc, int price) {
        this.name = name;
        this.desc = desc;
        this.price = price;
    }

    @Override public void add(AbstractMenu menu) { /*未使用*/ }

    @Override public AbstractMenu get(int index) { return null; }

    @Override public String getString() {
        return " - 【奶茶】* " + name + " 标注：" + desc + " 价格：" + price;
    }
}
