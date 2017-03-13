package cn.weiyf.dlcomic.entity;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

import cn.weiyf.dlcomic.base.Constant;


/**
 * Created by Administrator on 2017/2/6.
 */

public class Recommend {

    private ArrayList<SlideListBean> slide_list;

    private ArrayList<BookBean> book;

    private ArrayList<RankListBean> hot_list;

    private ArrayList<RankListBean> gold_list;

    private ArrayList<RankListBean> month_ticket_list;

    public ArrayList<SlideListBean> getSlide_list() {
        return slide_list;
    }

    public void setSlide_list(ArrayList<SlideListBean> slide_list) {
        this.slide_list = slide_list;
    }

    public List<BookBean> getBook() {
        return book;
    }

    public void setBook(ArrayList<BookBean> book) {
        this.book = book;
    }

    public ArrayList<RankListBean> getHot_list() {
        return hot_list;
    }

    public void setHot_list(ArrayList<RankListBean> hot_list) {
        this.hot_list = hot_list;
    }

    public ArrayList<RankListBean> getGold_list() {
        return gold_list;
    }

    public void setGold_list(ArrayList<RankListBean> gold_list) {
        this.gold_list = gold_list;
    }

    public ArrayList<RankListBean> getMonth_ticket_list() {
        return month_ticket_list;
    }

    public void setMonth_ticket_list(ArrayList<RankListBean> month_ticket_list) {
        this.month_ticket_list = month_ticket_list;
    }

    public static class SlideListBean {
        /**
         * id : 34
         * slide_desc : 漫客娘形象设计大赛开始啦
         * comic_id : http://vote.zymk.cn/vote/
         */

        private int id;

        private String slide_desc;

        private String comic_id;

        private String image;


        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getSlide_desc() {
            return slide_desc;
        }

        public void setSlide_desc(String slide_desc) {
            this.slide_desc = slide_desc;
        }

        public String getComic_id() {
            return comic_id;
        }

        public void setComic_id(String comic_id) {
            this.comic_id = comic_id;
        }

        public String getImage() {
            return Constant.BASE_IMAGE_URL + "news/000/000/";
        }

        public void setImage(String image) {
            this.image = image;
        }
    }

    public static class BookBean {
        /**
         * book_id : 1
         * book_name : 经典
         * summary : 成长中永不褪色的记忆
         * data : [{"comic_id":146,"comic_name":"妃夕妍雪","comic_feature":"三个女人和皇帝的纠葛","last_chapter":{"id":"12795","name":"107话"},"score":88},{"comic_id":153,"comic_name":"白夜玲珑","comic_feature":"缺爱少女等着骚年","last_chapter":{"id":"12840","name":"33话"},"score":92},{"comic_id":67,"comic_name":"哑舍","comic_feature":"这里的古董有故事","last_chapter":{"id":"7716","name":"64话"},"score":95},{"comic_id":100,"comic_name":"穿越西元3000后","comic_feature":"穿到三千年后玩机甲","last_chapter":{"id":"12828","name":"172话"},"score":93},{"comic_id":4,"comic_name":"哪吒传","comic_feature":"莲花少年他重生了","last_chapter":{"id":"7576","name":"39-2话"},"score":89},{"comic_id":1,"comic_name":"斗破苍穹","comic_feature":"只有实力才能守护家人","last_chapter":{"id":"12841","name":"186话"},"score":95},{"comic_id":101,"comic_name":"凤逆天下","comic_feature":"少女杀手魂穿飒爽复仇","last_chapter":{"id":"12824","name":"62话"},"score":93},{"comic_id":28,"comic_name":"九九八十一","comic_feature":"真·三国现代无双","last_chapter":{"id":"12815","name":"97话"},"score":93},{"comic_id":11,"comic_name":"暴走邻家","comic_feature":"敬一群蛇精病漫画家","last_chapter":{"id":"7648","name":"165话"},"score":94},{"comic_id":14,"comic_name":"天行轶事","comic_feature":"CP贵乱，不服不行","last_chapter":{"id":"7849","name":"67话"},"score":93},{"comic_id":118,"comic_name":"网游之近战法师","comic_feature":"法师外表武斗魂","last_chapter":{"id":"12825","name":"22话"},"score":87},{"comic_id":53,"comic_name":"勇者是女孩","comic_feature":"变男变女？KISS说了算","last_chapter":{"id":"8174","name":"56话"},"score":91},{"comic_id":42,"comic_name":"青春奇妙物语","comic_feature":"又名我的室友皆逗比","last_chapter":{"id":"7783","name":"19话"},"score":90},{"comic_id":26,"comic_name":"浪漫传说","comic_feature":"穿越少女的诸神后宫","last_chapter":{"id":"8029","name":"番外之四"},"score":93}]
         */

        private int book_id;

        private String book_name;

        private String summary;
        private List<Comic> data;

        public int getBook_id() {
            return book_id;
        }

        public void setBook_id(int book_id) {
            this.book_id = book_id;
        }

        public String getBook_name() {
            return book_name;
        }

        public void setBook_name(String book_name) {
            this.book_name = book_name;
        }

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public List<Comic> getData() {
            return data;
        }

        public void setData(List<Comic> data) {
            this.data = data;
        }


    }

    public static class RankListBean implements Parcelable {
        private int comic_id;

        private String comic_name;

        private int score;

        private LastChapter last_chapter;

        private String orderby;

        private List<ComicType> comic_type;

        private String image;

        protected RankListBean(Parcel in) {
            comic_id = in.readInt();
            comic_name = in.readString();
            score = in.readInt();
            orderby = in.readString();
            image = in.readString();
        }

        public static final Creator<RankListBean> CREATOR = new Creator<RankListBean>() {
            @Override
            public RankListBean createFromParcel(Parcel in) {
                return new RankListBean(in);
            }

            @Override
            public RankListBean[] newArray(int size) {
                return new RankListBean[size];
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

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public LastChapter getLast_chapter() {
            return last_chapter;
        }

        public void setLast_chapter(LastChapter last_chapter) {
            this.last_chapter = last_chapter;
        }

        public String getOrderby() {
            return orderby;
        }

        public void setOrderby(String orderby) {
            this.orderby = orderby;
        }

        public String getImage() {
            return Constant.BASE_IMAGE_URL + "cover/000/000/";
        }

        public void setImage(String image) {
            this.image = image;
        }

        public List<ComicType> getComic_type() {
            return comic_type;
        }

        public void setComic_type(List<ComicType> comic_type) {
            this.comic_type = comic_type;
        }


        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(comic_id);
            dest.writeString(comic_name);
            dest.writeInt(score);
            dest.writeString(orderby);
            dest.writeString(image);
        }
    }

}
