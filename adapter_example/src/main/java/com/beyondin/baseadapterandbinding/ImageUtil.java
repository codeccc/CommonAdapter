package com.beyondin.baseadapterandbinding;

import android.databinding.BindingAdapter;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.annotation.IntegerRes;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by wangbo on 2017-06-28.
 */

public class ImageUtil
{

    /**
     * 加载网络图片
     * @param holder
     * @param imageViewId
     * @param url
     */
    public static void loadImage(com.zhy.adapter.recyclerview.base.ViewHolder holder, int imageViewId, String url)
    {
        View view = holder.getView(imageViewId);
        if (view instanceof ImageView)
        {
            Glide.with(view.getContext()).asBitmap().load(url).into((ImageView) view);
        }

    }

    /**
     * 加载网络图片
     *
     * @param imageView 图片控件
     * @param imgurl       图片url
     */
    @BindingAdapter("bind:imgurl")
    public static void loadImage(ImageView imageView, String imgurl)
    {
        Glide.with(imageView.getContext()).load(imgurl).into(imageView);
    }

    /**
     * 加载Bitmap图片
     *
     * @param imageView 图片控件
     * @param bm        bitmap图片
     */
    public static void loadImage(ImageView imageView, Bitmap bm)
    {
        Glide.with(imageView.getContext()).load(bm).into(imageView);
    }

    /**
     * 加载Drawable图片
     *
     * @param imageView 图片控件
     * @param drawable  Drawable图片
     */
    public static void loadImage(ImageView imageView, Drawable drawable)
    {
        Glide.with(imageView.getContext()).load(drawable).into(imageView);
    }

    /**
     * 加载资源文件图片
     *
     * @param imageView 图片控件
     * @param resId     加载resid图片
     */
    public static void loadImage(ImageView imageView, @IntegerRes int resId)
    {
        Glide.with(imageView.getContext()).load(resId).into(imageView);
    }

}
