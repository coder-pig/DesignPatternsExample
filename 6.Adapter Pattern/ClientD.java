/**
 * Created by Administrator on 2017/1/20 0020.
 */

public class ClientD {
    public static void main(String[] args) {
        BaseAdapter adapter = new ChineseAdapter(new English());
        adapter.speakChinese("好！");
    }
}
