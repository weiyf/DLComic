package cn.weiyf.dlcomic.entity;

import java.util.List;

import cn.weiyf.dlcomic.util.CommonUtils;


/**
 * Created by Administrator on 2017/2/7.
 */

public class ComicInfo {



    private int comic_id;
    private String comic_name;
    private int score;
    private String author_name;
    private int total_click;
    private String desc;
    private long update_time;
    private int gold;
    private int jury;
    private int collection;
    private int total_ticket;
    private int recommend;
    private int share;
    private AuthorInfoBean author_info;
    private List<ComicType> comic_type;
    private List<ChapterListBean> chapter_list;
    private List<Comic> relation_list;
    private List<FansHotBean> fans_hot;
    private List<FansGoldBean> fans_gold;

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

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public int getTotal_click() {
        return total_click;
    }

    public void setTotal_click(int total_click) {
        this.total_click = total_click;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getUpdate_time() {
        return CommonUtils.formatDay(update_time);
    }

    public void setUpdate_time(long update_time) {
        this.update_time = update_time;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getJury() {
        return jury;
    }

    public void setJury(int jury) {
        this.jury = jury;
    }

    public int getCollection() {
        return collection;
    }

    public void setCollection(int collection) {
        this.collection = collection;
    }

    public int getTotal_ticket() {
        return total_ticket;
    }

    public void setTotal_ticket(int total_ticket) {
        this.total_ticket = total_ticket;
    }

    public int getRecommend() {
        return recommend;
    }

    public void setRecommend(int recommend) {
        this.recommend = recommend;
    }

    public int getShare() {
        return share;
    }

    public void setShare(int share) {
        this.share = share;
    }

    public AuthorInfoBean getAuthor_info() {
        return author_info;
    }

    public void setAuthor_info(AuthorInfoBean author_info) {
        this.author_info = author_info;
    }

    public List<ComicType> getComic_type() {
        return comic_type;
    }

    public void setComic_type(List<ComicType> comic_type) {
        this.comic_type = comic_type;
    }

    public List<ChapterListBean> getChapter_list() {
        return chapter_list;
    }

    public void setChapter_list(List<ChapterListBean> chapter_list) {
        this.chapter_list = chapter_list;
    }

    public List<Comic> getRelation_list() {
        return relation_list;
    }

    public void setRelation_list(List<Comic> relation_list) {
        this.relation_list = relation_list;
    }

    public List<FansHotBean> getFans_hot() {
        return fans_hot;
    }

    public void setFans_hot(List<FansHotBean> fans_hot) {
        this.fans_hot = fans_hot;
    }

    public List<FansGoldBean> getFans_gold() {
        return fans_gold;
    }

    public void setFans_gold(List<FansGoldBean> fans_gold) {
        this.fans_gold = fans_gold;
    }

    public static class AuthorInfoBean {

        private int user_level;
        private int id;
        private String name;
        private int fans;
        private String notice;
        private List<DataBean> data;

        public int getUser_level() {
            return user_level;
        }

        public void setUser_level(int user_level) {
            this.user_level = user_level;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getFans() {
            return fans;
        }

        public void setFans(int fans) {
            this.fans = fans;
        }

        public String getNotice() {
            return notice;
        }

        public void setNotice(String notice) {
            this.notice = notice;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {

            private int comic_id;
            private String comic_name;
            private String comic_feature;
            private LastChapter last_chapter;
            private int score;

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

            public int getScore() {
                return score;
            }

            public void setScore(int score) {
                this.score = score;
            }

        }
    }


    public static class ChapterListBean {

        private int chapter_id;
        private String chapter_name;
        private long create_time;
        private String chapter_addr;
        private int start_var;
        private int end_var;

        public int getChapter_id() {
            return chapter_id;
        }

        public void setChapter_id(int chapter_id) {
            this.chapter_id = chapter_id;
        }

        public String getChapter_name() {
            return chapter_name;
        }

        public void setChapter_name(String chapter_name) {
            this.chapter_name = chapter_name;
        }

        public long getCreate_time() {
            return create_time;
        }

        public void setCreate_time(long create_time) {
            this.create_time = create_time;
        }

        public String getChapter_addr() {
            return chapter_addr;
        }

        public void setChapter_addr(String chapter_addr) {
            this.chapter_addr = chapter_addr;
        }

        public int getStart_var() {
            return start_var;
        }

        public void setStart_var(int start_var) {
            this.start_var = start_var;
        }

        public int getEnd_var() {
            return end_var;
        }

        public void setEnd_var(int end_var) {
            this.end_var = end_var;
        }
    }


    public static class FansHotBean {

        private int id;
        private String name;
        private int count_num;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getCount_num() {
            return count_num;
        }

        public void setCount_num(int count_num) {
            this.count_num = count_num;
        }
    }

    public static class FansGoldBean {

        private int id;
        private String name;
        private int count_num;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getCount_num() {
            return count_num;
        }

        public void setCount_num(int count_num) {
            this.count_num = count_num;
        }
    }
}
