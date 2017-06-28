package com.beyondin.baseadapterandbinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.widget.Toast;

import com.beyondin.baseadapterandbinding.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    ActivityMainBinding mBinding;

    List<String> mStrings = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        for (int i = 0; i < 10; i++)
        {
            mStrings.add("第" + i + "行第" + i + "列的同学上课要好好听讲!");
        }
        mBinding.rcyComment.setLayoutManager(new LinearLayoutManager(this));

        mBinding.rcyComment.setAdapter(new TeacherCommentAdapter(this, R.layout.item_main_comment_teacher, mStrings,this));
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.imgHead:
                Toast.makeText(MainActivity.this, "position:" + v.getTag(R.id.position), Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
