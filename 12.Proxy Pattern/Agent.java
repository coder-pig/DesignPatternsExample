/**
 * Created by Coder-pig on 2017/3/3 0003.
 */

public class Agent implements FetchGoods{
    @Override public void fetchShoes() {
        Custom custom = new Custom();
        custom.fetchShoes();
        this.callCustom();
    }

    public void callCustom() { System.out.println("通知顾客过来取件！"); }

}
