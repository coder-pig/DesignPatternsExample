/**
 * Created by Administrator on 2017/1/20 0020.
 */

class Translator implements Chinese{

    private English english = new English();

    Translator(English english) { this.english = english; }

    @Override public void speakChinese(String string) { english.speakEnglish(string); }

}
