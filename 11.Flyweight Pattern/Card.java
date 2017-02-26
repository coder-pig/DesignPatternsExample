/**
 * 描述：
 *
 * @author coder-pig： 2017/02/13 下午4:38
 */

class Card {
    private String color;
    private String num;

    public Card() { }

    Card(String color, String num) {
        this.color = color;
        this.num = num;
    }

    public String getColor() { return color; }

    public void setColor(String color) { this.color = color; }

    public String getNum() { return num; }

    public void setNum(String num) { this.num = num; }

    @Override public String toString() {
        return "Card{" + "花色='" + color + '\'' + ", 大小='" + num + '\'' + '}';
    }
}
