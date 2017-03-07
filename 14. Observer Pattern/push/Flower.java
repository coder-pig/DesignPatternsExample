package push;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/3/7 0007.
 */

public class Flower implements Plant {

    private boolean state;

    private List<Insect> insects = new ArrayList<>();

    public boolean isState() {
        return state;
    }

    @Override public void registerInsect(Insect insect) {
        insects.add(insect);
    }

    @Override public void unregisterInsect(Insect insect) {
        insects.remove(insect);
    }

    @Override public void notifyInsect(boolean isOpen) {
        state = isOpen;
        if (state) {
            System.out.println("花开");
            for (Insect insect : insects) { insect.work(); }
        } else {
            System.out.println("花闭");
            for (Insect insect : insects) { insect.unWork(); }
        }

    }
}
