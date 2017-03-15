/**
 * Created by Administrator on 2017/3/15 0015.
 */

public class Tenant extends People {

    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void contact(String msg) {
        mediator.contact(this, msg);
    }

    public void getMessage(String msg) {
        System.out.println("【房客】" + name + "：" + msg);
    }

}
