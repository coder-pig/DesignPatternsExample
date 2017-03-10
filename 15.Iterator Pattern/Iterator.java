/**
 * Created by Administrator on 2017/3/9 0009.
 */


public interface Iterator {

    Song first();

    Song next();

    boolean hashNext();

    Song currentItem();
}
