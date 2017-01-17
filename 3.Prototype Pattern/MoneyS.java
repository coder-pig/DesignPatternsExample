import java.io.Serializable;

/**
 * Created by Administrator on 2017/1/16 0016.
 */

class MoneyS implements Serializable {

    private String type;    //币种

    MoneyS(String type) {
        this.type = type;
    }

    void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override public String toString() {
        return "Money{" + "type='" + type + '\'' + '}';
    }
}
