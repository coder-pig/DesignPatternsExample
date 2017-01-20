/**
 * Created by Administrator on 2017/1/20 0020.
 */

class ClassTranslator extends English implements Chinese {
    @Override public void speakChinese(String string) { speakEnglish(string); }
}
