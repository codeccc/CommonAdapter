package com.beyondin.baseadapterandbinding.adapter;

import com.beyondin.baseadapterandbinding.CommentModel;
import com.beyondin.baseadapterandbinding.ImageUtil;
import com.beyondin.baseadapterandbinding.R;
import com.beyondin.baseadapterandbinding.databinding.ItemCommentTeacherBinding;
import com.zhy.adapter.recyclerview.base.ItemViewDelegate;
import com.zhy.adapter.recyclerview.base.ViewHolder;

/**
 * Created by wangbo on 2017-06-28.
 */

public class TeacherCommentDelegate implements ItemViewDelegate<CommentModel>
{

    private ItemCommentTeacherBinding mBinding;
    private int mDataSize;

    public TeacherCommentDelegate(ItemCommentTeacherBinding binding, int dataSize)
    {

        mBinding = binding;
        mDataSize = dataSize;
    }

    @Override
    public int getItemViewLayoutId()
    {
        return R.layout.item_comment_teacher;
    }

    @Override
    public boolean isForViewType(CommentModel item, int position)
    {
        return item.type == CommentModel.TYPE_TEACHER;
    }

    @Override
    public void convert(ViewHolder holder, CommentModel model, int position)
    {
        ImageUtil.loadImage(mBinding.imgHead, model.headurl);
        mBinding.txtName.setText(model.name);
        holder.setText(R.id.txtContent, model.content);

    }
}
