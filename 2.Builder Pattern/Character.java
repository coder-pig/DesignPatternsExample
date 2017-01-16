/**
 * Created by Administrator on 2017/1/16 0016.
 */
/* 产品类 */
class Character {
    private String sex;

    private String face;

    private String clothes;

    void setSex(String sex) { this.sex = sex;}

    void setFace(String face) { this.face = face; }

    void setClothes(String clothes) { this.clothes = clothes;}

    String showMsg() { return "你创建了一个穿着 " + clothes + " 一副 " + face + " 的" + sex + "ヾ(≧▽≦*)o 戳菊狂笑~"; }

}
