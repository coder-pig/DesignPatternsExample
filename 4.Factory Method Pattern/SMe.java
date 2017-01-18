/**
 * Created by Administrator on 2017/1/18 0018.
 */

class SMe extends SMakeTea {
    @Override
    public <T extends Tea> T 小猪带特效的奶茶制作工艺(Class<T> clz) {
        System.out.println("==============");
        Tea tea = null;
        try {
            tea = (Tea) Class.forName(clz.getName()).newInstance();
            tea.加奶();
            tea.加茶();
            tea.加料();
            tea.打包();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) tea;
    }
}
