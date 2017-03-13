package cn.weiyf.dlcomic.entity;

import java.util.List;

import cn.weiyf.dlcomic.base.Constant;


/**
 * Created by Administrator on 2017/2/13.
 */

public class BookInfo {


    /**
     * book_name : 锐
     * summary : 其实，漫画家都修炼了绝技“洪荒之力”，脑洞快要压抑不住了！这里是强大的想象力聚集地，准备好迎接视觉风暴了吗？
     * collection : 0
     * share : 0
     * createtime : 1482560465620
     * updatetime : 1484814288483
     * user_id : 0
     * user_name :
     * book_list : [{"comic_id":193,"comic_name":"天降系拍档","score":93,"comic_type":[{"id":7,"name":"玄幻"},{"id":5,"name":"热血"},{"id":9,"name":"恋爱"},{"id":23,"name":"连载"},{"id":27,"name":"青年"},{"id":28,"name":"知音漫客"}],"content":"才没被人类女生驯养呢","last_chapter":{"id":"13205","name":"12话"}},{"comic_id":14,"comic_name":"天行轶事","score":94,"comic_type":[{"id":7,"name":"玄幻"},{"id":5,"name":"热血"},{"id":23,"name":"连载"},{"id":25,"name":"少男"},{"id":28,"name":"知音漫客"}],"content":"CP贵乱，不服不行","last_chapter":{"id":"7849","name":"67话"}},{"comic_id":152,"comic_name":"星空下神话","score":93,"comic_type":[{"id":5,"name":"热血"},{"id":6,"name":"搞笑"},{"id":23,"name":"连载"},{"id":25,"name":"少男"},{"id":28,"name":"知音漫客"}],"content":"旧传说的齿轮转动吧","last_chapter":{"id":"13206","name":"26话"}},{"comic_id":103,"comic_name":"三眼哮天录","score":93,"comic_type":[{"id":5,"name":"热血"},{"id":7,"name":"玄幻"},{"id":8,"name":"生活"},{"id":23,"name":"连载"},{"id":25,"name":"少男"},{"id":30,"name":"飒漫画"}],"content":"天神下凡来除妖","last_chapter":{"id":"12834","name":"222话"}},{"comic_id":27,"comic_name":"逆转木兰辞","score":90,"comic_type":[{"id":7,"name":"玄幻"},{"id":5,"name":"热血"},{"id":23,"name":"连载"},{"id":25,"name":"少男"},{"id":28,"name":"知音漫客"}],"content":"魂穿+性转，有点带感","last_chapter":{"id":"12814","name":"8话"}},{"comic_id":86,"comic_name":"交换契约","score":49,"comic_type":[{"id":6,"name":"搞笑"},{"id":9,"name":"恋爱"},{"id":15,"name":"校园"},{"id":23,"name":"连载"},{"id":26,"name":"少女"},{"id":51,"name":"漫客栈"}],"content":"你的身体是我的！","last_chapter":{"id":"13305","name":"10话"}},{"comic_id":70,"comic_name":"茗羽传奇","score":89,"comic_type":[{"id":9,"name":"恋爱"},{"id":13,"name":"悬疑"},{"id":16,"name":"历史"},{"id":23,"name":"连载"},{"id":26,"name":"少女"},{"id":51,"name":"漫客栈"}],"content":"和陆羽一起玩穿越","last_chapter":{"id":"13171","name":"19话"}},{"comic_id":95,"comic_name":"奇门女命师","score":87,"comic_type":[{"id":6,"name":"搞笑"},{"id":7,"name":"玄幻"},{"id":23,"name":"连载"},{"id":26,"name":"少女"},{"id":51,"name":"漫客栈"}],"content":"少侠，要算命不","last_chapter":{"id":"13296","name":"16话"}},{"comic_id":5,"comic_name":"饕餮娘子","score":85,"comic_type":[{"id":8,"name":"生活"},{"id":7,"name":"玄幻"},{"id":23,"name":"连载"},{"id":25,"name":"少男"},{"id":51,"name":"漫客栈"}],"content":"古代吃货养成食谱","last_chapter":{"id":"4388","name":"18话"}},{"comic_id":13,"comic_name":"万里晴川","score":88,"comic_type":[{"id":7,"name":"玄幻"},{"id":9,"name":"恋爱"},{"id":15,"name":"校园"},{"id":23,"name":"连载"},{"id":26,"name":"少女"},{"id":28,"name":"知音漫客"}],"content":"勇敢的书穿吧！","last_chapter":{"id":"7859","name":"16话"}},{"comic_id":4,"comic_name":"哪吒传","score":88,"comic_type":[{"id":7,"name":"玄幻"},{"id":10,"name":"动作"},{"id":21,"name":"萝莉"},{"id":23,"name":"连载"},{"id":25,"name":"少男"},{"id":51,"name":"漫客栈"}],"content":"莲花少年他重生了","last_chapter":{"id":"7576","name":"39-2话"}},{"comic_id":67,"comic_name":"哑舍","score":95,"comic_type":[{"id":7,"name":"玄幻"},{"id":9,"name":"恋爱"},{"id":16,"name":"历史"},{"id":23,"name":"连载"},{"id":26,"name":"少女"},{"id":28,"name":"知音漫客"}],"content":"这里的古董有故事","last_chapter":{"id":"13203","name":"65话"}},{"comic_id":35,"comic_name":"御狐之绊","score":93,"comic_type":[{"id":7,"name":"玄幻"},{"id":23,"name":"连载"},{"id":25,"name":"少男"},{"id":28,"name":"知音漫客"}],"content":"家养狐仙hin傲娇","last_chapter":{"id":"4860","name":"58话"}},{"comic_id":18,"comic_name":"东旅劫谈","score":91,"comic_type":[{"id":6,"name":"搞笑"},{"id":7,"name":"玄幻"},{"id":8,"name":"生活"},{"id":23,"name":"连载"},{"id":25,"name":"少男"},{"id":28,"name":"知音漫客"}],"content":"抱住仙人蹭经验","last_chapter":{"id":"12813","name":"31话"}}]
     */

    private String book_name;
    private String summary;
    private int collection;
    private int share;
    private long createtime;
    private long updatetime;
    private int user_id;
    private String user_name;
    private List<BookListBean> book_list;
    private String image;

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

    public int getCollection() {
        return collection;
    }

    public void setCollection(int collection) {
        this.collection = collection;
    }

    public int getShare() {
        return share;
    }

    public void setShare(int share) {
        this.share = share;
    }

    public long getCreatetime() {
        return createtime;
    }

    public void setCreatetime(long createtime) {
        this.createtime = createtime;
    }

    public long getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(long updatetime) {
        this.updatetime = updatetime;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public List<BookListBean> getBook_list() {
        return book_list;
    }

    public void setBook_list(List<BookListBean> book_list) {
        this.book_list = book_list;
    }

    public static class BookListBean {
        /**
         * comic_id : 193
         * comic_name : 天降系拍档
         * score : 93
         * comic_type : [{"id":7,"name":"玄幻"},{"id":5,"name":"热血"},{"id":9,"name":"恋爱"},{"id":23,"name":"连载"},{"id":27,"name":"青年"},{"id":28,"name":"知音漫客"}]
         * content : 才没被人类女生驯养呢
         * last_chapter : {"id":"13205","name":"12话"}
         */

        private int comic_id;
       private String comic_name;
        private float score;
        private String content;
        private LastChapter last_chapter;
        private List<String> tags;
        private List<ComicType> comic_type;
        private String image;

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

        public float getScore() {
            return score;
        }

        public void setScore(float score) {
            this.score = score;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public LastChapter getLast_chapter() {
            return last_chapter;
        }

        public void setLast_chapter(LastChapter last_chapter) {
            this.last_chapter = last_chapter;
        }

        public List<ComicType> getComic_type() {
            return comic_type;
        }

        public void setComic_type(List<ComicType> comic_type) {
            this.comic_type = comic_type;
        }

        public String getImage() {
            return Constant.BASE_IMAGE_URL + "cover/000/000/";
        }

        public void setImage(String image) {
            this.image = image;
        }

        public List<String> getTags() {
            return tags;
        }

        public void setTags(List<String> tags) {
            this.tags = tags;
        }



    }

    public String getImage() {
        return Constant.BASE_IMAGE_URL + "book/000/000/";
    }

    public void setImage(String image) {
        this.image = image;
    }
}
