/**
 * Created by Administrator on 2017/3/13 0013.
 */

public class PauseCommand implements Command {

    private StoryPlayer mPlayer;

    public PauseCommand(StoryPlayer mPlayer) {
        this.mPlayer = mPlayer;
    }

    @Override public void execute() {
        mPlayer.pause();
    }

}
