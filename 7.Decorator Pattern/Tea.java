/**
 * Created by Administrator on 2017/1/21 0021.
 */

abstract class Tea {
    private String name = "茶";

    public String getName() { return name; }

    void setName(String name) { this.name = name; }

    public abstract int price();
}
