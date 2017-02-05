package bridge;

/**
 * Created by Administrator on 2017/2/5 0005.
 */

class HeiJiaoSauces extends Sauces{

    HeiJiaoSauces(Steak steak) { super(steak); }

    @Override public String sauces() { return steak.sale() + "加黑椒汁"; }
}
