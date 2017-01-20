/**
 * Created by Administrator on 2017/1/20 0020.
 */

class ChineseAdapter extends BaseAdapter {

    private English english;

    ChineseAdapter(English english) { this.english = english; }

    @Override public void speakChinese(String string) { english.speakEnglish(string); }
}
