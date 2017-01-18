/**
 * Created by Administrator on 2017/1/18 0018.
 */

class YeGuoMakeTea extends MakeTea {
    @Override
    Tea 小猪带特效的奶茶制作工艺() {
        System.out.println("====== 椰果小弟炮制日式椰果奶茶 ======");
        Tea tea = new YeGuoTea();
        tea.加奶();
        tea.加茶();
        tea.加料();
        tea.打包();
        return tea;
    }
}
