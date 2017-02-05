package bridge;

/**
 * Created by Administrator on 2017/2/5 0005.
 */

abstract class Sauces {
    Steak steak;

    Sauces(Steak steak) { this.steak = steak; }

    abstract String sauces();
}
