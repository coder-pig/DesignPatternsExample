package use;

/**
 * Created by Administrator on 2017/1/25 0025.
 */

abstract class AbstractMenu {
    public abstract void add(AbstractMenu menu);
    public abstract AbstractMenu get(int index);
    public abstract String getString();
}
