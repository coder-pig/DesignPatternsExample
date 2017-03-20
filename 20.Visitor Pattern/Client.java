/**
 * Created by Administrator on 2017/3/20 0020.
 */

public class Client {
    public static void main(String[] args) {
        GameRoom room = new GameRoom();
        room.add(new Shooting());
        room.add(new Dancing());
        room.add(new Driving());

        Player player1 = new MalePlayer();
        Player player2 = new FemalePlayer();

        room.action(player1);
        room.action(player2);
    }
}
