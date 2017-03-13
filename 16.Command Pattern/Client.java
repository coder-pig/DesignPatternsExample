import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/3/13 0013.
 */

public class Client {
    public static void main(String[] args) {
        //实例化播放列表
        List<Story> mList = new ArrayList<>();
        mList.add(new Story("白雪公主",""));
        mList.add(new Story("青蛙的愿望",""));
        mList.add(new Story("驴和妈",""));
        mList.add(new Story("小青蛙的烦恼",""));
        mList.add(new Story("三字经",""));

        //实例化接收者
        StoryPlayer mPlayer = new StoryPlayer();

        //实例化命令对象
        Command setListCommand = new SetListCommand(mPlayer);
        Command playCommand = new PlayCommand(mPlayer);
        Command pauseCommand = new PauseCommand(mPlayer);
        Command nextCommand = new NextCommand(mPlayer);
        Command preCommand = new PreCommand(mPlayer);

        //实例化请求者
        Invoker invoker = new Invoker();
        invoker.setSetListCommand((SetListCommand) setListCommand);
        invoker.setPlayList(mList);
        invoker.setPlayCommand((PlayCommand) playCommand);
        invoker.setPauseCommand((PauseCommand) pauseCommand);
        invoker.setNextCommand((NextCommand) nextCommand);
        invoker.setPreCommand((PreCommand) preCommand);

        //测试调用
        invoker.play();
        invoker.next();
        invoker.next();
        invoker.next();
        invoker.next();
        invoker.next();
        invoker.pause();
        invoker.play();
    }
}
