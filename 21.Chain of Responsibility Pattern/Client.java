/**
 * Created by Administrator on 2017/3/20 0020.
 */

public class Client {
    public static void main(String[] args) {
        Brother brother = new Brother();
        Father father = new Father();
        Mother mother = new Mother();

        //指定下家
        brother.setNextHandler(father);
        father.setNextHandler(mother);

        brother.handlerRequest("要钱",1200);
    }
}
