package com.verifone.tony.uitest;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.txt)
    public TextView textView;

    @BindView(R.id.editTxt)
    public EditText editText;

    @BindView(R.id.btnOne)
    public Button btnOne;

    /** EditText result;
     *  Button; */
    @OnClick(R.id.btnOne)
    public void onBtnOneClicked() {
        String getEditText = editText.getText().toString();
        Toast.makeText(getApplicationContext(), getEditText, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        /**---------------- ImageView/TextView ------------------------------------------------*/
        Drawable[] drawable = textView.getCompoundDrawables();
        // 数组下表0~3,依次是:左上右下
        //left, top 可以理解为x, y坐标, 相对于文字的.
        //right, bottom可以理解为宽度和高度
        drawable[2].setBounds(0, 0, 64, 64);
        textView.setCompoundDrawables(drawable[0], drawable[1], drawable[2],
                drawable[3]);

        /*---------------- EditView ------------------------------------------------*/


        /*---------------- ButtonView ------------------------------------------------*/


        /*---------------- textView ------------------------------------------------*/
    }



}
