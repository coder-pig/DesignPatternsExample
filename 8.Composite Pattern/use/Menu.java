package use;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/1/25 0025.
 */

class Menu extends AbstractMenu {
    private String name;
    private String desc;
    private List<AbstractMenu> menus = new ArrayList<>();

    Menu(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    @Override public void add(AbstractMenu menu) { menus.add(menu); }

    @Override public AbstractMenu get(int index) { return menus.get(index); }

    @Override public String getString() {
        StringBuilder sb = new StringBuilder("\n【菜单】：" + name + " 信息：" + desc + "\n");
        for (AbstractMenu menu: menus) { sb.append(menu.getString()).append("\n"); }
        return sb.toString();
    }
}
