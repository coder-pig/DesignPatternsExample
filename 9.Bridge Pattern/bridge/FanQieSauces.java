package bridge;

/**
 * Created by Administrator on 2017/2/5 0005.
 */

class FanQieSauces extends Sauces{

    FanQieSauces(Steak steak) { super(steak); }

    @Override public String sauces() { return steak.sale() + "加番茄汁"; }
}
