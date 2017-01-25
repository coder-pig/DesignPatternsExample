package unuse;

/**
 * Created by Administrator on 2017/1/25 0025.
 */

public class Store {
    public static void main(String[] args) {
        Menu mainMenu = new Menu("大菜单", "包含所有子菜单");
        Menu drinkMenu = new Menu("饮品菜单", "都是喝的");
        Menu eatMenu = new Menu("小吃菜单", "都是吃的");

        MilkTea milkTea = new MilkTea("珍珠奶茶", "奶茶+珍珠", 5);
        Juice juice = new Juice("鲜榨猕猴桃枝", "无添加即榨", 8);
        FishBall ball = new FishBall("咖喱鱼蛋", "微辣", 6);
        HandCake cake = new HandCake("培根手抓饼", "正宗台湾风味", 8);

        drinkMenu.addMilkTea(milkTea);
        drinkMenu.addJuice(juice);
        eatMenu.addFishBall(ball);
        eatMenu.addHandCake(cake);
        mainMenu.addMenu(drinkMenu);
        mainMenu.addMenu(eatMenu);

        System.out.println(mainMenu.toString());
    }
}
