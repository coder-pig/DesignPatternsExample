/**
 * Created by Administrator on 2017/3/15 0015.
 */


public abstract class People {
    protected String name;
    protected Mediator mediator;    //每个人都知道中介

    public People(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
