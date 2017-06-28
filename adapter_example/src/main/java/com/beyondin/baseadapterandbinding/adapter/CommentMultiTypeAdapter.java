package com.beyondin.baseadapterandbinding.adapter;

import android.content.Context;
import android.databinding.ViewDataBinding;

import com.beyondin.baseadapterandbinding.CommentModel;
import com.zhy.adapter.recyclerview.MultiItemTypeAdapter;

import java.util.List;

/**
 * Created by wangbo on 2017-06-28.
 */

public class CommentMultiTypeAdapter extends MultiItemTypeAdapter<CommentModel, ViewDataBinding>
{
    public CommentMultiTypeAdapter(Context context, List<CommentModel> datas)
    {
        super(context, datas);

    }


}
