/**
 * Created by Administrator on 2017/1/21 0021.
 */

class JinJu extends Decorator{

    Tea tea;

    JinJu(Tea tea) { this.tea = tea; }

    @Override public String getName() { return "金桔" + tea.getName(); }

    @Override public int price() { return 1 + tea.price(); }
}
