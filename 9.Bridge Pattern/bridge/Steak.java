package bridge;

/**
 * 描述：
 *
 * @author coder-pig： 2017/02/05 下午1:59
 */

abstract class Steak {
    Rations rations;

    Steak(Rations rations) { this.rations = rations; }

    abstract String sale();
}
