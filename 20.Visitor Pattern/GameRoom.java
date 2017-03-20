import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/3/20 0020.
 */

public class GameRoom  {

    private List<Machine> machines = new ArrayList<>();

    public void add(Machine machine) {
        machines.add(machine);
    }

    public void action(Player player) {
        for (Machine machine: machines) {
            machine.accept(player);
        }
    }
}
