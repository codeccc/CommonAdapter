package com.beyondin.baseadapterandbinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import com.beyondin.baseadapterandbinding.databinding.ActivityMutitypeBinding;

/**
 * Created by wangbo on 2017-06-28.
 */

public class MutiTypeActivity extends AppCompatActivity
{

    ActivityMutitypeBinding mBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_mutitype);

        mBinding.rcyMutiType.setLayoutManager(new LinearLayoutManager(this));
    }
}
