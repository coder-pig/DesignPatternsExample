package bridge;

/**
 * 描述：
 *
 * @author coder-pig： 2017/02/05 下午2:11
 */

class ChickenSteak extends Steak{

    ChickenSteak(Rations rations) { super(rations); }

    @Override public String sale() { return "鸡扒"+ (rations == null ? "" : rations.rations()); }
}
