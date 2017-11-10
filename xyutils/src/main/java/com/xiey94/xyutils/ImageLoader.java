package com.xiey94.xyutils;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.bumptech.glide.request.RequestOptions;

/**
 * Created by xiey on 2017/8/19.
 * 图片加载
 */

public class ImageLoader {

    //缓存策略需要的时候再添加，目前全部默认需要缓存

    /**
     * 加载普通图片
     */
    public static void loadImage(String url, ImageView imageView) {
        RequestBuilder<Drawable> requestBuilder = Glide
                .with(XyUtilsApplication.getContext())
                .load(url);
        requestBuilder
                .into(imageView);
    }

    /**
     * 加载本地普通图片
     */
    public static void loadImage(int resource, ImageView imageView) {
        RequestBuilder<Drawable> requestBuilder = Glide
                .with(XyUtilsApplication.getContext())
                .load(resource);
        requestBuilder
                .into(imageView);
    }

    /**
     * 加载普通圆形图片
     */
    public static void loadRoundImage(String url, ImageView imageView) {
        RequestBuilder<Drawable> requestBuilder = Glide
                .with(XyUtilsApplication.getContext())
                .load(url);
        requestBuilder
                .apply(RequestOptions
                        .bitmapTransform(new CircleCrop())
                )
                .into(imageView);
    }


    /**
     * 加载图片，带占位图+失败占位图
     */
    public static void loadImage(String url, int placeholder, ImageView imageView) {
        RequestBuilder<Drawable> requestBuilder = Glide
                .with(XyUtilsApplication.getContext())
                .load(url);
        RequestOptions options = new RequestOptions()
                .placeholder(placeholder);
        requestBuilder
                .apply(options)
                .transition(new DrawableTransitionOptions().crossFade())
                .into(imageView);
    }

    /**
     * 加载圆形图片，带占位图+失败占位图
     */
    public static void loadRoundImage(String url, int placeholder, ImageView imageView) {
        RequestBuilder<Drawable> requestBuilder = Glide
                .with(XyUtilsApplication.getContext())
                .load(url);
        requestBuilder
                .apply(RequestOptions
                        .bitmapTransform(new CircleCrop())
                        .placeholder(placeholder)
                )
                .transition(new DrawableTransitionOptions().crossFade())
                .into(imageView);
    }

    /**
     * 加载图片，带失败占位图
     */
    public static void loadImage(String url, int placeholder, int error, ImageView imageView) {
        RequestBuilder<Drawable> requestBuilder = Glide
                .with(XyUtilsApplication.getContext())
                .load(url);
        RequestOptions options = new RequestOptions()
                .placeholder(placeholder)
                .error(error);
        requestBuilder
                .apply(options)
                .transition(new DrawableTransitionOptions().crossFade())
                .into(imageView);
    }

    /**
     * 加载圆形图片，带失败占位图
     */
    public static void loadRoundImage(String url, int placeholder, int error, ImageView imageView) {
        RequestBuilder<Drawable> requestBuilder = Glide
                .with(XyUtilsApplication.getContext())
                .load(url);
        requestBuilder
                .apply(RequestOptions
                        .bitmapTransform(new CircleCrop())
                        .placeholder(placeholder)
                        .error(error)
                )
                .transition(new DrawableTransitionOptions().crossFade())
                .into(imageView);
    }

    /**
     * 加载全方位图片
     *
     * @param url         图片地址
     * @param placeholder 占位图
     * @param error       加载失败占位图
     * @param imageView   图片控件
     * @param duration    淡入淡出时长
     */
    public static void loadImage(String url, int placeholder, int error, ImageView imageView, int duration) {
        RequestBuilder<Drawable> requestBuilder = Glide
                .with(XyUtilsApplication.getContext())
                .load(url);
        RequestOptions options = new RequestOptions()
                .placeholder(placeholder)
                .error(error);
        requestBuilder
                .apply(options)
                .transition(new DrawableTransitionOptions().crossFade(duration))
                .into(imageView);
    }

}
