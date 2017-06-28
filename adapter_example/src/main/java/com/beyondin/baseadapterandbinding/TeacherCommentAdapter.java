package com.beyondin.baseadapterandbinding;

import android.content.Context;
import android.view.View;

import com.beyondin.baseadapterandbinding.databinding.ItemCommentTeacherBinding;
import com.zhy.adapter.recyclerview.CommonAdapter;
import com.zhy.adapter.recyclerview.base.ViewHolder;

import java.util.List;

/**
 * Created by wangbo on 2017-06-28.
 */

public class TeacherCommentAdapter extends CommonAdapter<String, ItemCommentTeacherBinding> implements View.OnClickListener
{
    private View.OnClickListener mOnClickListener;

    public TeacherCommentAdapter(Context context, int layoutId, List<String> datas)
    {
        super(context, layoutId, datas);
    }

    public TeacherCommentAdapter(Context context, int layoutId, List<String> datas, View.OnClickListener onClickListener)
    {
        super(context, layoutId, datas);
        mOnClickListener = onClickListener;
    }

    @Override
    protected void convert(ViewHolder holder, String s, int position)
    {
        holder.setTag(R.id.imgHead, R.id.position, position);
        holder.setOnClickListener(R.id.imgHead, this);
        mBinding.txtContent.setText(s);
        mBinding.txtName.setText("李老师");
    }

    @Override
    public void onClick(View v)
    {
        mOnClickListener.onClick(v);
    }
}
