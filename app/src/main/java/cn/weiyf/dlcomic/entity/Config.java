package cn.weiyf.dlcomic.entity;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

import cn.weiyf.dlcomic.base.Constant;


/**
 * Created by Administrator on 2017/2/6.
 */

public class Config {



    private String newest_version;
    private String pakege_url_rule;
    private String update_title;
    private String update_desc;
    private IpBean ip;
    private int iospublic;
    private String comicdomain;
    private String coverpath;
    private String newspath;
    private String bookpath;
    private String bookiconpath;
    private String headpath;
    private String uploadpath;
    private String comicpath;
    private ComicDefinitionBean comic_definition;
    private String sortpath;
    private int cache_time;
    private String temp_time;
    
    private List<ComicType> comic_type;

    public String getNewest_version() {
        return newest_version;
    }

    public void setNewest_version(String newest_version) {
        this.newest_version = newest_version;
    }

    public String getPakege_url_rule() {
        return pakege_url_rule;
    }

    public void setPakege_url_rule(String pakege_url_rule) {
        this.pakege_url_rule = pakege_url_rule;
    }

    public String getUpdate_title() {
        return update_title;
    }

    public void setUpdate_title(String update_title) {
        this.update_title = update_title;
    }

    public String getUpdate_desc() {
        return update_desc;
    }

    public void setUpdate_desc(String update_desc) {
        this.update_desc = update_desc;
    }

    public IpBean getIp() {
        return ip;
    }

    public void setIp(IpBean ip) {
        this.ip = ip;
    }

    public int getIospublic() {
        return iospublic;
    }

    public void setIospublic(int iospublic) {
        this.iospublic = iospublic;
    }

    public String getComicdomain() {
        return comicdomain;
    }

    public void setComicdomain(String comicdomain) {
        this.comicdomain = comicdomain;
    }

    public String getCoverpath() {
        return coverpath;
    }

    public void setCoverpath(String coverpath) {
        this.coverpath = coverpath;
    }

    public String getNewspath() {
        return newspath;
    }

    public void setNewspath(String newspath) {
        this.newspath = newspath;
    }

    public String getBookpath() {
        return bookpath;
    }

    public void setBookpath(String bookpath) {
        this.bookpath = bookpath;
    }

    public String getBookiconpath() {
        return bookiconpath;
    }

    public void setBookiconpath(String bookiconpath) {
        this.bookiconpath = bookiconpath;
    }

    public String getHeadpath() {
        return headpath;
    }

    public void setHeadpath(String headpath) {
        this.headpath = headpath;
    }

    public String getUploadpath() {
        return uploadpath;
    }

    public void setUploadpath(String uploadpath) {
        this.uploadpath = uploadpath;
    }

    public String getComicpath() {
        return comicpath;
    }

    public void setComicpath(String comicpath) {
        this.comicpath = comicpath;
    }

    public ComicDefinitionBean getComic_definition() {
        return comic_definition;
    }

    public void setComic_definition(ComicDefinitionBean comic_definition) {
        this.comic_definition = comic_definition;
    }

    public String getSortpath() {
        return sortpath;
    }

    public void setSortpath(String sortpath) {
        this.sortpath = sortpath;
    }

    public int getCache_time() {
        return cache_time;
    }

    public void setCache_time(int cache_time) {
        this.cache_time = cache_time;
    }

    public String getTemp_time() {
        return temp_time;
    }

    public void setTemp_time(String temp_time) {
        this.temp_time = temp_time;
    }

    public List<ComicType> getComic_type() {
        return comic_type;
    }

    public void setComic_type(List<ComicType> comic_type) {
        this.comic_type = comic_type;
    }

    public static class IpBean {

        private String url;
        private String region;
        private String city;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }
    }

    public static class ComicDefinitionBean {

        private String low;
        private String middle;
        private String high;

        public String getLow() {
            return low;
        }

        public void setLow(String low) {
            this.low = low;
        }

        public String getMiddle() {
            return middle;
        }

        public void setMiddle(String middle) {
            this.middle = middle;
        }

        public String getHigh() {
            return high;
        }

        public void setHigh(String high) {
            this.high = high;
        }
    }

    public static class ComicType {

        private String sort_group;
        
        private ArrayList<DataBean> data;

        public String getSort_group() {
            return sort_group;
        }

        public void setSort_group(String sort_group) {
            this.sort_group = sort_group;
        }

        public ArrayList<DataBean> getData() {
            return data;
        }

        public void setData(ArrayList<DataBean> data) {
            this.data = data;
        }

        public static class DataBean implements Parcelable {
            private int id;
            
            private String name;
            
            private String image;

            protected DataBean(Parcel in) {
                id = in.readInt();
                name = in.readString();
                image = in.readString();
            }

            public static final Creator<DataBean> CREATOR = new Creator<DataBean>() {
                @Override
                public DataBean createFromParcel(Parcel in) {
                    return new DataBean(in);
                }

                @Override
                public DataBean[] newArray(int size) {
                    return new DataBean[size];
                }
            };

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

            public String getImage() {
                return Constant.BASE_IMAGE_URL + "sort/000/000/";
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
                dest.writeInt(id);
                dest.writeString(name);
                dest.writeString(image);
            }
        }
    }
}
