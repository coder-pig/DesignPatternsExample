/**
 * Created by Administrator on 2017/1/16 0016.
 */
public class Game {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Character character =  director.createCharacter("基佬","硬汉脸","死库水");
        System.out.println(character.showMsg());
    }
}
