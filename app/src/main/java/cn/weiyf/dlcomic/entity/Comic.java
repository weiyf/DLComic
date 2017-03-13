package cn.weiyf.dlcomic.entity;

import android.os.Parcel;
import android.os.Parcelable;

import cn.weiyf.dlcomic.base.Constant;


/**
 * Created by Administrator on 2017/2/10.
 */

public class Comic implements Parcelable {
    /**
     * comic_id : 146
     * comic_name : 妃夕妍雪
     * comic_feature : 三个女人和皇帝的纠葛
     * last_chapter : {"id":"12795","name":"107话"}
     * score : 88
     */

    private int comic_id;

    private String comic_name;

    private String comic_feature;

    private LastChapter last_chapter;

    private float score;

    private String image;


    protected Comic(Parcel in) {
        comic_id = in.readInt();
        comic_name = in.readString();
        comic_feature = in.readString();
        score = in.readFloat();
        image = in.readString();
    }

    public static final Creator<Comic> CREATOR = new Creator<Comic>() {
        @Override
        public Comic createFromParcel(Parcel in) {
            return new Comic(in);
        }

        @Override
        public Comic[] newArray(int size) {
            return new Comic[size];
        }
    };

    public int getComic_id() {
        return comic_id;
    }

    public void setComic_id(int comic_id) {
        this.comic_id = comic_id;
    }

    public String getComic_name() {
        return comic_name;
    }

    public void setComic_name(String comic_name) {
        this.comic_name = comic_name;
    }

    public String getComic_feature() {
        return comic_feature;
    }

    public void setComic_feature(String comic_feature) {
        this.comic_feature = comic_feature;
    }

    public LastChapter getLast_chapter() {
        return last_chapter;
    }

    public void setLast_chapter(LastChapter last_chapter) {
        this.last_chapter = last_chapter;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public String getImage() {
        return Constant.BASE_IMAGE_URL + "cover/000/000/";
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(comic_id);
        dest.writeString(comic_name);
        dest.writeString(comic_feature);
        dest.writeFloat(score);
        dest.writeString(image);
    }

}