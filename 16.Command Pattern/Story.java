/**
 * Created by Administrator on 2017/3/13 0013.
 */

public class Story {
    private String sName;
    private String sUrl;

    public Story(String sName, String sUrl) {
        this.sName = sName;
        this.sUrl = sUrl;
    }

    public String getsUrl() {
        return sUrl;
    }

    public void setsUrl(String sUrl) {
        this.sUrl = sUrl;
    }

    public String getsName() {

        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }
}
