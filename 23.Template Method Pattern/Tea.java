/**
 * Created by Administrator on 2017/3/21 0021.
 */

public abstract class Tea {

    protected void 加奶() {
        System.out.println("加入三花淡奶");
    }

    protected abstract void 加茶();

    protected abstract void 加料();

    protected  void 打包() {
        System.out.println("用打包机打包");
    }

    //钩子方法
    protected boolean 是否打包() {
        return true;
    }

    public final void make() {
        System.out.println("=== 开始制作 ===");
        加奶();
        加茶();
        加料();
        if(是否打包()) {
            打包();
        }
        System.out.println("=== 制作完毕 ===");
    }

}
