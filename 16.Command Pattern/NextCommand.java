/**
 * Created by Administrator on 2017/3/13 0013.
 */

public class NextCommand implements Command {

    private StoryPlayer mPlayer;

    public NextCommand(StoryPlayer mPlayer) {
        this.mPlayer = mPlayer;
    }

    @Override public void execute() {
        mPlayer.next();
    }

}
