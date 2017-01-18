/**
 * Created by Administrator on 2017/1/18 0018.
 */

class FirstXiaoDi extends MakeFood {
    @Override public Drink createMakeDrink() { return new MilkTea(); }
    @Override public Snack createMakeFood() { return new HandGrab(); }
}
