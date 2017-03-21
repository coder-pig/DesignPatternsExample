/**
 * Created by Administrator on 2017/3/21 0021.
 */

public class Client {
    public static void main(String[] args) {
        MorningState morningState = new MorningState();
        AfternoonState afternoonState = new AfternoonState();
        EveningState eveningState = new EveningState();

        Context context = new Context();
        context.setState(morningState);
        context.setState(afternoonState);
        context.setState(eveningState);
    }
}
