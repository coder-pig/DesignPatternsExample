/**
 * Created by Administrator on 2017/2/10 0010.
 */

public class LoLer {
    public static void main(String[] args) {
        A a = new A();
        E e = new E();
        JiuTou jiuTou = new JiuTou();
        LeftClick leftClick = new LeftClick();
        Q q = new Q();
        R r = new R();
        ShanXian shanXian = new ShanXian();
        Space space = new Space();

        System.out.println("===  单身靠手速之：锐雯光速QA ===");
        StringBuilder sb1 = new StringBuilder();
        sb1.append(q.q()).append(" + ");
        sb1.append(space.space()).append(" + ");
        sb1.append(a.a()).append(" + ");
        sb1.append(leftClick.leftClick()).append(" + ");
        sb1.append(q.q()).append(" + ");
        sb1.append(space.space()).append(" + ");
        sb1.append(a.a()).append(" + ");
        sb1.append(leftClick.leftClick()).append(" + ");
        sb1.append(q.q()).append(" + ");
        sb1.append(space.space()).append(" + ");
        sb1.append(a.a()).append(" + ");
        sb1.append(leftClick.leftClick()).append("\n");
        System.out.println(sb1.toString());

        System.out.println("===  单身靠手速之：瞎子一秒七脚 ===");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(q.q()).append(" + ");
        sb2.append(a.a()).append(" + ");
        sb2.append(e.e()).append(" + ");
        sb2.append(jiuTou.jiutou()).append(" + ");
        sb2.append(r.r()).append(" + ");
        sb2.append(a.a()).append(" + ");
        sb2.append(shanXian.shanxian()).append(" + ");
        sb2.append(q.q()).append("\n");
        System.out.println(sb2.toString());
    }
}
