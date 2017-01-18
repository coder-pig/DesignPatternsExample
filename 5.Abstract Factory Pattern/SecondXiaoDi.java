/**
 * Created by Administrator on 2017/1/18 0018.
 */
public class SecondXiaoDi implements MakeFood {

    @Override public Drink createMakeDrink() { return new Juice(); }

    @Override public Snack createMakeFood() { return new FishBall(); }
}
