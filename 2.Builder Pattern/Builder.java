/**
 * Created by Administrator on 2017/1/16 0016.
 */
/* 抽象Builder类 */
interface Builder {

    void setSex(String sex);

    void setFace(String face);

    void setClothes(String clothes);

    Character build();

}
