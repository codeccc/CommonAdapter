package com.beyondin.baseadapterandbinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import com.beyondin.baseadapterandbinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity
{

    ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mBinding.rcyComment.setLayoutManager(new LinearLayoutManager(this));
    }
}
