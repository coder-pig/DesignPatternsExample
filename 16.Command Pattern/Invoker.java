import java.util.List;

/**
 * Created by Administrator on 2017/3/13 0013.
 */

public class Invoker {
    private SetListCommand setListCommand;
    private PlayCommand playCommand;
    private PauseCommand pauseCommand;
    private NextCommand nextCommand;
    private PreCommand preCommand;

    public void setSetListCommand(SetListCommand setListCommand) {
        this.setListCommand = setListCommand;
    }

    public void setPlayCommand(PlayCommand playCommand) {
        this.playCommand = playCommand;
    }

    public void setPauseCommand(PauseCommand pauseCommand) {
        this.pauseCommand = pauseCommand;
    }

    public void setNextCommand(NextCommand nextCommand) {
        this.nextCommand = nextCommand;
    }

    public void setPreCommand(PreCommand preCommand) {
        this.preCommand = preCommand;
    }

    /* 设置播放列表 */
    public void setPlayList(List<Story> list) {
        setListCommand.setPlayList(list);
        setListCommand.execute();
    }

    /* 播放 */
    public void play() {
        playCommand.execute();
    }

    /* 暂停 */
    public void pause() {
        pauseCommand.execute();
    }

    /* 下一首 */
    public void next() {
        nextCommand.execute();
    }

    /* 上一首 */
    public void pre() {
        preCommand.execute();
    }
}
