package fly;

public class ClubCard extends Card{

    public ClubCard() { super(); }

    @Override public void showCard(String num) { System.out.println("梅花：" + num); }
}
