/**
 * Created by Administrator on 2017/3/6 0006.
 */

public class Context {
    private Compute compute;

    public Context() { compute = new Add(); }

    public void setCompute(Compute compute) { this.compute = compute; }

    public void calc(int first, int second) { System.out.println(compute.compute(first, second)); }

}
