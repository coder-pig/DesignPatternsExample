/**
 * Created by Administrator on 2017/3/13 0013.
 */



public class PlayCommand implements Command {

    private StoryPlayer mPlayer;

    public PlayCommand(StoryPlayer mPlayer) {
        this.mPlayer = mPlayer;
    }

    @Override public void execute() {
        mPlayer.play();
    }

}
