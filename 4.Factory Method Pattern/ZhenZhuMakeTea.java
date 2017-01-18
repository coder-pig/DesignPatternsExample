/**
 * Created by Administrator on 2017/1/18 0018.
 */


class ZhenZhuMakeTea extends MakeTea {
    @Override
    Tea 小猪带特效的奶茶制作工艺() {
        System.out.println("====== 珍珠小弟炮制港式珍珠奶茶 ======");
        Tea tea = new ZhenZhuTea();
        tea.加奶();
        tea.加茶();
        tea.加料();
        tea.打包();
        return tea;
    }
}
