/**
 * Created by Administrator on 2017/3/21 0021.
 */

public class GreenTeaMilkTea extends Tea {

    private boolean isPack = true;

    public GreenTeaMilkTea(boolean isPack) {
        this.isPack = isPack;
    }

    @Override protected void 加茶() {
        System.out.println("加入绿茶");
    }

    @Override protected void 加料() {
        System.out.println("加入椰果");
    }

    @Override protected boolean 是否打包() {
        return isPack;
    }
}
