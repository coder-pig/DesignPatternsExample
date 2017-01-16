/**
 * Created by Administrator on 2017/1/16 0016.
 */
class ConcreteBuilder implements Builder {

    private Character mCharacter = new Character();

    @Override public void setSex(String sex) { mCharacter.setSex(sex); }

    @Override public void setFace(String face) { mCharacter.setFace(face); }

    @Override public void setClothes(String clothes) { mCharacter.setClothes(clothes); }

    @Override public Character build() {return mCharacter;}

}
