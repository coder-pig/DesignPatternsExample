/**
 * Created by Administrator on 2017/1/21 0021.
 */


class HongDou extends Decorator{

    Tea tea;

    HongDou(Tea tea) { this.tea = tea; }

    @Override public String getName() { return "红豆" + tea.getName(); }

    @Override  public int price() { return 2 + tea.price(); }
}
