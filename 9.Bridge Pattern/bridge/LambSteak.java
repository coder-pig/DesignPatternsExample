package bridge;

/**
 * 描述：
 *
 * @author coder-pig： 2017/02/05 下午2:11
 */

class LambSteak extends Steak{

    LambSteak(Rations rations) { super(rations); }

    @Override public String sale() { return "羊扒"+ (rations == null ? "" : rations.rations()); }
}
