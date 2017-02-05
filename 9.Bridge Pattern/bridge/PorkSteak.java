package bridge;

/**
 * 描述：
 *
 * @author coder-pig： 2017/02/05 下午2:17
 */

class PorkSteak extends Steak {

    PorkSteak(Rations rations) { super(rations); }

    @Override public String sale() { return "猪扒"+ (rations == null ? "" : rations.rations()); }
}
