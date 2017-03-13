package cn.weiyf.dlcomic.adapter;

import android.databinding.BindingAdapter;
import android.databinding.BindingMethod;
import android.databinding.BindingMethods;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import cn.weiyf.dlcomic.R;
import jp.wasabeef.glide.transformations.BlurTransformation;

@BindingMethods({
        @BindingMethod(type = TabLayout.class, attribute = "viewpager", method = "setupWithViewPager"),
        @BindingMethod(type = AppBarLayout.class, attribute = "offsetChanged", method = "addOnOffsetChangedListener"),
        @BindingMethod(type = TabLayout.class, attribute = "onTabSelected", method = "addOnTabSelectedListener"),
})
public class DataBindingAdapter {



    @BindingAdapter(value = {"image", "width", "height", "thumbnail", "blur"}, requireAll = false)
    public static void setImage(ImageView imageView, String url, int width, int height, float thumbnail, int blur) {
        if (width != 0 || height != 0) {
            Glide.with(imageView.getContext()).load(url).crossFade().override(width, height).into(imageView);
        } else if (thumbnail != 0.0F) {
            Glide.with(imageView.getContext()).load(url).crossFade().placeholder(R.drawable.pic_empty).error(R.drawable.pic_empty).thumbnail(thumbnail).into(imageView);
        } else if (blur != 0) {
            Glide.with(imageView.getContext()).load(url)
                    .bitmapTransform(new BlurTransformation(imageView.getContext(), blur))
                    .crossFade().placeholder(R.drawable.pic_empty).error(R.drawable.pic_empty).into(imageView);
        } else {
            Glide.with(imageView.getContext()).load(url).crossFade().placeholder(R.drawable.pic_empty).error(R.drawable.pic_empty).into(imageView);
        }
    }

    @BindingAdapter({"menu"})
    public static void inflateMenu(Toolbar toolbar, int menuRes) {
        if (menuRes != 0) {
            toolbar.inflateMenu(menuRes);
        }
    }

    @BindingAdapter({"initRefresh"})
    public static void initRefresh(SwipeRefreshLayout swipeRefreshLayout, SwipeRefreshLayout.OnRefreshListener onRefreshListener) {
        swipeRefreshLayout.setColorSchemeResources(android.R.color.holo_blue_light,
                android.R.color.holo_green_light,
                android.R.color.holo_orange_light,
                android.R.color.holo_red_light);
        swipeRefreshLayout.setOnRefreshListener(onRefreshListener);
    }

    @BindingAdapter({"isRefresh"})
    public static void isRefresh(SwipeRefreshLayout swipeRefreshLayout, boolean isRefresh) {
        swipeRefreshLayout.setRefreshing(isRefresh);
    }


//    @BindingAdapter({"scrollFlags"})
//    public static void setScrollFlags(AppBarLayout appBarLayout, int scrollFlags) {
//        AppBarLayout.LayoutParams mParams = (AppBarLayout.LayoutParams) appBarLayout.getChildAt(0).getLayoutParams();
//        mParams.setScrollFlags(scrollFlags);
//    }
//
//    @BindingAdapter({"collapseMode", "index"})
//    public static void setCollapseMode(CollapsingToolbarLayout collapsingToolbarLayout, int collapseMode, int index) {
//        CollapsingToolbarLayout.LayoutParams mParams = (CollapsingToolbarLayout.LayoutParams) collapsingToolbarLayout.getChildAt(index - 1).getLayoutParams();
//        mParams.setCollapseMode(collapseMode);
//
//    }

}
