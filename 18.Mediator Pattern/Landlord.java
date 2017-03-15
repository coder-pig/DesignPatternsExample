/**
 * Created by Administrator on 2017/3/15 0015.
 */

public class Landlord extends People {

    public Landlord(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void contact(String msg) {
        mediator.contact(this, msg);
    }

    public void getMessage(String msg) {
        System.out.println("【房东】" + name + "：" + msg);
    }

}
