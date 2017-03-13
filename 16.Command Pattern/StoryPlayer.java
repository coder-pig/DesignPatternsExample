import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/3/13 0013.
 */

public class StoryPlayer {

    private int cursor = 0; //当前播放项

    private int pauseCursor = -1;   //暂停播放项

    private List<Story> playList = new ArrayList<>();   //播放列表

    public void setPlayList(List<Story> list) {
        this.playList = list;
        cursor = 0;
        System.out.println("更新播放列表...");
    }

    public void play() {
        cursor = 0;
        play(cursor);
    }

    public void play(int cursor) {
        if(playList.size() == 0) {
            System.out.println("当前播放列表为空，请先设置播放列表！");
        } else {
            if(pauseCursor == cursor) {
                System.out.println("继续播放第" + pauseCursor + "个故事: 《" + playList.get(pauseCursor).getsName() + "》");
            } else  {
                this.cursor = cursor;
                System.out.println("开始播放第" + cursor + "个故事: 《" + playList.get(cursor).getsName() + "》");
            }
        }
    }

    public void next() {
        cursor++;
        if(cursor == playList.size()) cursor = 0;
        play(cursor);
    }

    public void pre() {
        cursor--;
        if(cursor < 0) cursor = playList.size() - 1;
        play(cursor);
    }

    public void pause() {
        pauseCursor = cursor;
        System.out.println("暂停播放！");
    }
}
