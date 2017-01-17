/**
 * Created by Administrator on 2017/1/16 0016.
 */

class Money implements Cloneable{

    private String type;    //币种

    Money(String type) { this.type = type; }

    void setType(String type) {
        this.type = type;
    }

    @Override public String toString() { return "Money{" + "type='" + type + '\'' + '}';}

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Money money = null;
        try {
            money = (Money) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return money;
    }
}
