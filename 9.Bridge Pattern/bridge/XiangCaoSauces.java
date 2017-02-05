package bridge;

/**
 * Created by Administrator on 2017/2/5 0005.
 */

class XiangCaoSauces extends Sauces{

    XiangCaoSauces(Steak steak) { super(steak); }

    @Override public String sauces() { return steak.sale() + "加香草汁"; }
}
