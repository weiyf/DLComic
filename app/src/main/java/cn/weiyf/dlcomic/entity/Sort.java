package cn.weiyf.dlcomic.entity;

import java.util.List;

/**
 * Created by Administrator on 2017/2/12.
 */

public class Sort {


    /**
     * type : {"id":5,"name":"热血"}
     * key :
     * sort : score
     * page : {"total_num":235,"page_size":30,"total_page":8,"current_page":1,"comic_list":[{"comic_id":679,"comic_name":"卡莉的挽歌","comic_feature":"","last_chapter":{"id":"9693","name":"全一话"},"score":99},{"comic_id":662,"comic_name":"月星","comic_feature":"","last_chapter":{"id":"12509","name":"下"},"score":99},{"comic_id":573,"comic_name":"独角森林","comic_feature":"","last_chapter":{"id":"8734","name":"全一话"},"score":99},{"comic_id":563,"comic_name":"与恶魔和平相处的初级手册","comic_feature":"","last_chapter":{"id":"12325","name":"下"},"score":99},{"comic_id":493,"comic_name":"黑犬前世传","comic_feature":"","last_chapter":{"id":"9378","name":"全一话"},"score":99},{"comic_id":469,"comic_name":"豪杰物语","comic_feature":"","last_chapter":{"id":"9311","name":"全一话"},"score":99},{"comic_id":468,"comic_name":"废土","comic_feature":"","last_chapter":{"id":"8876","name":"全一话"},"score":99},{"comic_id":453,"comic_name":"校园侦探杰少爷","comic_feature":"","last_chapter":{"id":"11937","name":"全一话"},"score":99},{"comic_id":443,"comic_name":"浮云山","comic_feature":"","last_chapter":{"id":"8905","name":"下"},"score":99},{"comic_id":442,"comic_name":"我家狗狗是男神","comic_feature":"","last_chapter":{"id":"13209","name":"3话"},"score":99},{"comic_id":440,"comic_name":"花开半夏","comic_feature":"","last_chapter":{"id":"9287","name":"全一话"},"score":99},{"comic_id":438,"comic_name":"我只是路过的扫地僧","comic_feature":"","last_chapter":{"id":"11120","name":"全一话"},"score":99},{"comic_id":423,"comic_name":"合成朱丽叶","comic_feature":"","last_chapter":{"id":"9128","name":"最终话"},"score":99},{"comic_id":419,"comic_name":"化身","comic_feature":"","last_chapter":{"id":"9124","name":"全一话"},"score":99},{"comic_id":354,"comic_name":"概率操控者","comic_feature":"","last_chapter":{"id":"9032","name":"全一话"},"score":99},{"comic_id":347,"comic_name":"怪物","comic_feature":"","last_chapter":{"id":"9030","name":"全一话"},"score":99},{"comic_id":331,"comic_name":"棒槌冒险岛","comic_feature":"","last_chapter":{"id":"8455","name":"9话"},"score":99},{"comic_id":327,"comic_name":"暴走吧狐小妹","comic_feature":"","last_chapter":{"id":"8446","name":"全一话"},"score":99},{"comic_id":316,"comic_name":"五点半的眼睛","comic_feature":"","last_chapter":{"id":"11102","name":"全一话"},"score":99},{"comic_id":304,"comic_name":"wtf战","comic_feature":"","last_chapter":{"id":"11100","name":"3话"},"score":99},{"comic_id":288,"comic_name":"希亚物语","comic_feature":"","last_chapter":{"id":"11455","name":"下"},"score":99},{"comic_id":276,"comic_name":"公车惊魂","comic_feature":"","last_chapter":{"id":"9013","name":"全一话"},"score":99},{"comic_id":264,"comic_name":"冰雪王子","comic_feature":"","last_chapter":{"id":"8373","name":"全一话"},"score":99},{"comic_id":251,"comic_name":"非常战场","comic_feature":"校园，穿越，热血","last_chapter":{"id":"9004","name":"下"},"score":99},{"comic_id":249,"comic_name":"请将试卷交至图书馆2F","comic_feature":"穿越 搞笑","last_chapter":{"id":"10457","name":"全一话"},"score":99},{"comic_id":242,"comic_name":"不存在的谋杀","comic_feature":"","last_chapter":{"id":"8368","name":"全一话"},"score":99},{"comic_id":236,"comic_name":"不一样的特工","comic_feature":"","last_chapter":{"id":"8366","name":"下"},"score":99},{"comic_id":176,"comic_name":"天师外传","comic_feature":"搞笑 武侠","last_chapter":{"id":"12803","name":"全一话"},"score":99},{"comic_id":68,"comic_name":"远古大作战","comic_feature":"只有远古世界没有考试","last_chapter":{"id":"4916","name":"13话"},"score":99},{"comic_id":452,"comic_name":"少年与魔法","comic_feature":"","last_chapter":{"id":"10610","name":"下"},"score":98.66666667}]}
     */

    private ComicType type;
    private String key;
    private String sort;
    private PageBean page;

    public ComicType getType() {
        return type;
    }

    public void setType(ComicType type) {
        this.type = type;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public PageBean getPage() {
        return page;
    }

    public void setPage(PageBean page) {
        this.page = page;
    }


    public static class PageBean {
        /**
         * total_num : 235
         * page_size : 30
         * total_page : 8
         * current_page : 1
         * comic_list : [{"comic_id":679,"comic_name":"卡莉的挽歌","comic_feature":"","last_chapter":{"id":"9693","name":"全一话"},"score":99},{"comic_id":662,"comic_name":"月星","comic_feature":"","last_chapter":{"id":"12509","name":"下"},"score":99},{"comic_id":573,"comic_name":"独角森林","comic_feature":"","last_chapter":{"id":"8734","name":"全一话"},"score":99},{"comic_id":563,"comic_name":"与恶魔和平相处的初级手册","comic_feature":"","last_chapter":{"id":"12325","name":"下"},"score":99},{"comic_id":493,"comic_name":"黑犬前世传","comic_feature":"","last_chapter":{"id":"9378","name":"全一话"},"score":99},{"comic_id":469,"comic_name":"豪杰物语","comic_feature":"","last_chapter":{"id":"9311","name":"全一话"},"score":99},{"comic_id":468,"comic_name":"废土","comic_feature":"","last_chapter":{"id":"8876","name":"全一话"},"score":99},{"comic_id":453,"comic_name":"校园侦探杰少爷","comic_feature":"","last_chapter":{"id":"11937","name":"全一话"},"score":99},{"comic_id":443,"comic_name":"浮云山","comic_feature":"","last_chapter":{"id":"8905","name":"下"},"score":99},{"comic_id":442,"comic_name":"我家狗狗是男神","comic_feature":"","last_chapter":{"id":"13209","name":"3话"},"score":99},{"comic_id":440,"comic_name":"花开半夏","comic_feature":"","last_chapter":{"id":"9287","name":"全一话"},"score":99},{"comic_id":438,"comic_name":"我只是路过的扫地僧","comic_feature":"","last_chapter":{"id":"11120","name":"全一话"},"score":99},{"comic_id":423,"comic_name":"合成朱丽叶","comic_feature":"","last_chapter":{"id":"9128","name":"最终话"},"score":99},{"comic_id":419,"comic_name":"化身","comic_feature":"","last_chapter":{"id":"9124","name":"全一话"},"score":99},{"comic_id":354,"comic_name":"概率操控者","comic_feature":"","last_chapter":{"id":"9032","name":"全一话"},"score":99},{"comic_id":347,"comic_name":"怪物","comic_feature":"","last_chapter":{"id":"9030","name":"全一话"},"score":99},{"comic_id":331,"comic_name":"棒槌冒险岛","comic_feature":"","last_chapter":{"id":"8455","name":"9话"},"score":99},{"comic_id":327,"comic_name":"暴走吧狐小妹","comic_feature":"","last_chapter":{"id":"8446","name":"全一话"},"score":99},{"comic_id":316,"comic_name":"五点半的眼睛","comic_feature":"","last_chapter":{"id":"11102","name":"全一话"},"score":99},{"comic_id":304,"comic_name":"wtf战","comic_feature":"","last_chapter":{"id":"11100","name":"3话"},"score":99},{"comic_id":288,"comic_name":"希亚物语","comic_feature":"","last_chapter":{"id":"11455","name":"下"},"score":99},{"comic_id":276,"comic_name":"公车惊魂","comic_feature":"","last_chapter":{"id":"9013","name":"全一话"},"score":99},{"comic_id":264,"comic_name":"冰雪王子","comic_feature":"","last_chapter":{"id":"8373","name":"全一话"},"score":99},{"comic_id":251,"comic_name":"非常战场","comic_feature":"校园，穿越，热血","last_chapter":{"id":"9004","name":"下"},"score":99},{"comic_id":249,"comic_name":"请将试卷交至图书馆2F","comic_feature":"穿越 搞笑","last_chapter":{"id":"10457","name":"全一话"},"score":99},{"comic_id":242,"comic_name":"不存在的谋杀","comic_feature":"","last_chapter":{"id":"8368","name":"全一话"},"score":99},{"comic_id":236,"comic_name":"不一样的特工","comic_feature":"","last_chapter":{"id":"8366","name":"下"},"score":99},{"comic_id":176,"comic_name":"天师外传","comic_feature":"搞笑 武侠","last_chapter":{"id":"12803","name":"全一话"},"score":99},{"comic_id":68,"comic_name":"远古大作战","comic_feature":"只有远古世界没有考试","last_chapter":{"id":"4916","name":"13话"},"score":99},{"comic_id":452,"comic_name":"少年与魔法","comic_feature":"","last_chapter":{"id":"10610","name":"下"},"score":98.66666667}]
         */

        private int total_num;
        private int page_size;
        private int total_page;
        private int current_page;
        private List<Comic> comic_list;

        public int getTotal_num() {
            return total_num;
        }

        public void setTotal_num(int total_num) {
            this.total_num = total_num;
        }

        public int getPage_size() {
            return page_size;
        }

        public void setPage_size(int page_size) {
            this.page_size = page_size;
        }

        public int getTotal_page() {
            return total_page;
        }

        public void setTotal_page(int total_page) {
            this.total_page = total_page;
        }

        public int getCurrent_page() {
            return current_page;
        }

        public void setCurrent_page(int current_page) {
            this.current_page = current_page;
        }

        public List<Comic> getComic_list() {
            return comic_list;
        }

        public void setComic_list(List<Comic> comic_list) {
            this.comic_list = comic_list;
        }

    }
}
