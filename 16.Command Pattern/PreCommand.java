/**
 * Created by Administrator on 2017/3/13 0013.
 */

public class PreCommand implements Command {

    private StoryPlayer mPlayer;

    public PreCommand(StoryPlayer mPlayer) {
        this.mPlayer = mPlayer;
    }

    @Override public void execute() {
        mPlayer.pre();
    }

}
