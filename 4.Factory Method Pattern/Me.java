
/**
 * Created by Administrator on 2017/1/18 0018.
 */

class Me {
    static Tea makeTea(int type) {
        System.out.println("==============");
        Tea tea = type == 0 ? new ZhenZhuTea() : new YeGuoTea();
        tea.加奶();
        tea.加茶();
        tea.加料();
        tea.打包();
        return tea;
    }
}
