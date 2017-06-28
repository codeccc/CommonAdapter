package com.beyondin.baseadapterandbinding;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.view.View;

import com.zhy.adapter.recyclerview.base.ViewHolder;

/**
 * Created by wangbo on 2017-06-28.
 */

public class BaseHolder extends ViewHolder
{

    public Context mContext;
    public ViewDataBinding mBinding;

    public BaseHolder(Context context, View itemView)
    {
        super(context, itemView);
        mContext = context;
        mBinding = DataBindingUtil.bind(itemView);
    }
}
