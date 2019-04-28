package com.verifone.tony.uitest;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.txt)
    public TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        txtView = findViewById(R.id.txt);
        Drawable[] drawable = txtView.getCompoundDrawables();
        // 数组下表0~3,依次是:左上右下
        //left, top 可以理解为x, y坐标, 相对于文字的.
        //right, bottom可以理解为宽度和高度
        drawable[2].setBounds(0, 0, 64, 64);
        txtView.setCompoundDrawables(drawable[0], drawable[1], drawable[2],
                drawable[3]);
    }



}
