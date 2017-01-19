/**
 * Created by Administrator on 2017/1/18 0018.
 */

class SecondXiaoDi extends MakeFood {
    @Override public Drink createMakeDrink() { return new Juice(); }
    @Override public Snack createMakeSnack() { return new FishBall(); }
}
