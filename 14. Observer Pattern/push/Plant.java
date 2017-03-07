package push;

/**
 * Created by Administrator on 2017/3/7 0007.
 */

public interface Plant {
    public void registerInsect(Insect insect);

    public void unregisterInsect(Insect insect);

    public void notifyInsect(boolean isOpen);
}
