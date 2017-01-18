/**
 * Created by Administrator on 2017/1/18 0018.
 */
public class FirstXiaoDi implements MakeFood{

    @Override public Drink createMakeDrink() { return new MilkTea(); }

    @Override public Snack createMakeFood() { return new HandGrab(); }

}
