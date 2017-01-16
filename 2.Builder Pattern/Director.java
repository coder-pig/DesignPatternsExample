/**
 * Created by Administrator on 2017/1/16 0016.
 */
class Director {

    private Builder mBuilder = null;

    Director(Builder builder) { this.mBuilder = builder; }

    Character createCharacter(String sex, String face, String clothes) {
        this.mBuilder.setSex(sex);
        this.mBuilder.setFace(face);
        this.mBuilder.setClothes(clothes);
        return mBuilder.build();
    }
}
