/**
 * Created by Administrator on 2017/1/21 0021.
 */

class ZhenZhu extends Decorator {

    Tea tea;

    ZhenZhu(Tea tea) { this.tea = tea; }

    @Override public String getName() { return "珍珠" + tea.getName(); }

    @Override public int price() { return 2 + tea.price(); }
}
