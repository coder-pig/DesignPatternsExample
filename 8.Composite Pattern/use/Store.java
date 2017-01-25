package use;

/**
 * Created by Administrator on 2017/1/25 0025.
 */

public class Store {
    public static void main(String[] args) {
        AbstractMenu mainMenu = new Menu("大菜单", "包含所有子菜单");
        AbstractMenu drinkMenu = new Menu("饮品菜单", "都是喝的");
        AbstractMenu eatMenu = new Menu("小吃菜单", "都是吃的");
        AbstractMenu milkTea = new MilkTea("珍珠奶茶", "奶茶+珍珠", 5);
        AbstractMenu juice = new Juice("鲜榨猕猴桃枝", "无添加即榨", 8);
        AbstractMenu ball = new FishBall("咖喱鱼蛋", "微辣", 6);
        AbstractMenu cake = new HandCake("培根手抓饼", "正宗台湾风味", 8);

        drinkMenu.add(milkTea);
        drinkMenu.add(juice);
        eatMenu.add(ball);
        eatMenu.add(cake);
        mainMenu.add(drinkMenu);
        mainMenu.add(eatMenu);

        System.out.println(mainMenu.getString());
    }
}
