/**
 * Created by Administrator on 2017/2/10 0010.
 */

class JiaoBen {
    A a;
    Q q;
    E e;
    R r;
    ShanXian shanXian;
    JiuTou jiuTou;
    LeftClick leftClick;
    Space space;

    JiaoBen() {
        a = new A();
        e = new E();
        jiuTou = new JiuTou();
        leftClick = new LeftClick();
        q = new Q();
        r = new R();
        shanXian = new ShanXian();
        space = new Space();
    }

    String 锐雯() {
        StringBuilder sb = new StringBuilder();
        sb.append(q.q()).append(" + ");
        sb.append(space.space()).append(" + ");
        sb.append(a.a()).append(" + ");
        sb.append(leftClick.leftClick()).append(" + ");
        sb.append(q.q()).append(" + ");
        sb.append(space.space()).append(" + ");
        sb.append(a.a()).append(" + ");
        sb.append(leftClick.leftClick()).append(" + ");
        sb.append(q.q()).append(" + ");
        sb.append(space.space()).append(" + ");
        sb.append(a.a()).append(" + ");
        sb.append(leftClick.leftClick()).append("\n");
        return sb.toString();
    }

    String 瞎子() {
        StringBuilder sb = new StringBuilder();
        sb.append(q.q()).append(" + ");
        sb.append(a.a()).append(" + ");
        sb.append(e.e()).append(" + ");
        sb.append(jiuTou.jiutou()).append(" + ");
        sb.append(r.r()).append(" + ");
        sb.append(a.a()).append(" + ");
        sb.append(shanXian.shanxian()).append(" + ");
        sb.append(q.q()).append("\n");
        return sb.toString();
    }

}
