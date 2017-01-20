/**
 * Created by Administrator on 2017/1/20 0020.
 */



public class Client {
    public static void main(String[] args) {
        Chinese chinese = new Translator(new English());
        chinese.speakChinese("那你很棒棒哦！");
    }
}
