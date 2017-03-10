import java.util.*;

/**
 * Created by Administrator on 2017/3/9 0009.
 */

public class Client {
    public static void main(String[] args) {
        List<Song> list = new ArrayList<>();
        list.add(new Song("空白格","杨宗纬"));
        list.add(new Song("那时候的我","刘惜君"));
        list.add(new Song("黑泽明","陈奕迅"));
        list.add(new Song("今天只做一件事","陈奕迅"));
        list.add(new Song("童话镇","陈一发儿"));

        MyStoryList songList = new MyStoryList(list);

        Iterator iterator = songList.getIterator();

        while (iterator.hashNext()) {
            System.out.println(iterator.currentItem().toString());
            iterator.next();
        }
    }
}
